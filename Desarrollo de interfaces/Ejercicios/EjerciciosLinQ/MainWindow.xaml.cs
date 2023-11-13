using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace EjerciciosLinQ
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        List<Cliente> clientes = new List<Cliente>
{
    new Cliente { ClienteId = 1, Nombre = "Juan" },
    new Cliente { ClienteId = 2, Nombre = "Maria" },
    new Cliente { ClienteId = 3, Nombre = "Carlos" },
    new Cliente { ClienteId = 4, Nombre = "Laura" }
};

        List<Empresa> empresas = new List<Empresa>
{
    new Empresa { EmpresaId = 1, Nombre = "Empresa A" },
    new Empresa { EmpresaId = 2, Nombre = "Empresa B" },
    new Empresa { EmpresaId = 3, Nombre = "Empresa C" },
    new Empresa { EmpresaId = 4, Nombre = "Empresa D" },
    new Empresa { EmpresaId = 5, Nombre = "Empresa F" }
};

        List<Venta> ventas = new List<Venta>
{
    new Venta { VentaId = 1, ClienteId = 1, EmpresaId = 1, Monto = 10000.50 },
    new Venta { VentaId = 2, ClienteId = 2, EmpresaId = 2, Monto = 7500.20 },
    new Venta { VentaId = 3, ClienteId = 1, EmpresaId = 3, Monto = 10000.75 },
    new Venta { VentaId = 4, ClienteId = 3, EmpresaId = 1, Monto = 15000.00 },
    new Venta { VentaId = 5, ClienteId = 4, EmpresaId = 2, Monto = 2000.30 },
    new Venta { VentaId = 6, ClienteId = 2, EmpresaId = 3, Monto = 8000.60 },
    new Venta { VentaId = 7, ClienteId = 4, EmpresaId = 1, Monto = 15000.25 },
    new Venta { VentaId = 8, ClienteId = 3, EmpresaId = 2, Monto = 9500.40 },
    new Venta { VentaId = 8, ClienteId = 1, EmpresaId = 2, Monto = 1000.40 }
};
        public MainWindow()
        {
            InitializeComponent();
        }
        private void Ejercicio1()
        {
            /* : Total de ventas por cliente
Usa LINQ para calcular el total de ventas para cada cliente.
*/

            
            var resultado = from nombre in clientes
                            join idCliente in ventas
                            on nombre.ClienteId equals idCliente.ClienteId
                            select new
                            {
                                Nombre = nombre.Nombre,
                                Ventas = idCliente.Monto
                            };

            lbresultadosListBox.Items.Clear();

            foreach (var item in resultado)
            {
                lbresultadosListBox.Items.Add($" Nombre : {item.Nombre} - Total Ventas: {item.Ventas:C}");

            }


        }
        private void Ejercicio2()
        {
            //Cliente que más ha gastado
            //Encuentra al cliente que ha gastado más dinero en total.

            var resultado = from clienteGastado in ventas
                            join NombreCliente in clientes
                            on clienteGastado.ClienteId equals NombreCliente.ClienteId
                            where clienteGastado.Monto == ventas.Max(v => v.Monto)
                            select new {

                                Nombre = NombreCliente.Nombre,
                                TotalGastado = clienteGastado.Monto
                            };

            lbresultadosListBox.Items.Clear();

            foreach(var item in resultado)
            {
                lbresultadosListBox.Items.Add($"Nombre: {item.Nombre} \n \t Gastado: {item.TotalGastado:C}");
            }

        }
        private void Ejercicio3()
        {
            /* : Empresas con ventas superiores a cierta cantidad
Obtén una lista de empresas que tienen ventas totales superiores a 2250.
 */
            var resultado = from listaEmpresas in empresas
                            join ventasTot in ventas on listaEmpresas.EmpresaId equals ventasTot.EmpresaId
                            where ventasTot.Monto > 2250
                            select new
                            {
                                Empresa = listaEmpresas.Nombre,
                                Ventas = ventasTot.Monto,
                            };

            lbresultadosListBox.Items.Clear();
            foreach (var item in resultado)
            {

                lbresultadosListBox.Items.Add($"Empresa: {item.Empresa} \n\t Ventas Totales : {item.Ventas:C}");

            }

        }
        private void Ejercicio4()
        {
            /* Monto total de ventas para una empresa específica
Dada una empresa, calcula el dinero total de todas las ventas asociadas.
 */

            var resultado = from totalVentas in ventas
                            join NombreEmpresa in empresas on totalVentas.EmpresaId equals NombreEmpresa.EmpresaId
                            select new
                            {
                                Empresa = NombreEmpresa.Nombre,
                                Total = ventas.Sum(v => v.Monto)
                            };

            lbresultadosListBox.Items.Clear();

            foreach (var item in resultado)
            {
                lbresultadosListBox.Items.Add($"Empresa {item.Empresa} \n\t Ventas totales : {item.Total:C}");
                
            }
        }
        private void Ejercicio5()
        {
            /* : Clientes que han comprado en todas las empresas
Encuentra los clientes que han realizado al menos una compra en cada empresa.
 */
            var resultado = from compras in ventas
                            join clients in clientes on compras.ClienteId equals clients.ClienteId
                            join enterprise in empresas on compras.EmpresaId equals enterprise.EmpresaId
                            where compras.EmpresaId == 1
                            select new
                            {
                                Cliente = clients.Nombre,
                                Empresa = enterprise.Nombre
                            };

            lbresultadosListBox.Items.Clear();

            foreach (var item in resultado)
            {

                lbresultadosListBox.Items.Add($"Cliente: {item.Cliente}\n\t Empresa : {item.Empresa}");

            }

        }
        private void Ejercicio6()
        {
            /* : Empresas sin ventas
Identifica las empresas que no han realizado ninguna venta.
*/

            var resultado = from NombreEmpresa in empresas
                            where !ventas.Any(v=> v.EmpresaId== NombreEmpresa.EmpresaId)
                            select new
                            {
                                EmpresaSinVenta = NombreEmpresa.Nombre
                            };

            lbresultadosListBox.Items.Clear();

            foreach( var item in resultado) {
                lbresultadosListBox.Items.Add($"Empresa {item.EmpresaSinVenta}");
            }
        }

        private void Ejercicio7()
        {
            /* Ventas por encima de la media
Encuentra las ventas cuyos beneficios están por encima del promedio de todas las ventas.
*/

            var resultado = from ventasMedia in ventas.Average(media=>media.Monto ("media"))

        }
        private void Ejercicio8()
        {
            /* Empresas que han vendido a un cliente específico
Dado un cliente, encuentra las empresas a las que ha realizado compras.
 */


        }
        private void Ejercicio9()
        {
            throw new NotImplementedException();
        }

        private void Ejercicio10()
        {
            throw new NotImplementedException();
        }


        private void MostrarResultados_Click(object sender, RoutedEventArgs e)
        {
            //Ejercicio1();
            //Ejercicio2();
            //Ejercicio3();
            //Ejercicio4();
            //Ejercicio5();
            //Ejercicio6();
            //Ejercicio7();
            Ejercicio8();
        }
    }
}
