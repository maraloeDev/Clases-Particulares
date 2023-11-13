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
 
        {
           
        }

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
            throw new NotImplementedException();
        }

        private void Ejercicio5()
        {
            throw new NotImplementedException();
        }
        private void Ejercicio6()
        {
            throw new NotImplementedException();
        }

        private void Ejercicio7()
        {
            throw new NotImplementedException();
        }
        private void Ejercicio8()
        {
            throw new NotImplementedException();
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
            Ejercicio3();
        }
    }
}
