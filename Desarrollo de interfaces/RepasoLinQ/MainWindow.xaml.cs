using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace RepasoLinQ
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    /// 
            // IEnumerable <T> (La T representa cualquier tipo de dato), es una estrucura comun, y permite es iterar usando un foreach
    public partial class MainWindow : Window
    {

    public ArrayList empresas = new ArrayList();
    public ArrayList empleados = new ArrayList();

        public MainWindow()
        {
            InitializeComponent();
            CrearConsultasConObjetos();
        }
        private void CrearConsultasConObjetos()
        {
            //----------------------------EMPRESA-------------------------------------------------

            Empresa empresa1 = new Empresa { id = 1, nombre = "ABC Corporation" };
            Empresa empresa2 = new Empresa { id = 2, nombre = "XYZ Ltda" };
            Empresa empresa3 = new Empresa { id = 3, nombre = "Tech Innovators Inc." };
            Empresa empresa4 = new Empresa { id = 4, nombre = "Global Services Co." };
            Empresa empresa5 = new Empresa { id = 5, nombre = "Innovate Solutions Ltd." };
            empresas.Add(empresa2);
            empresas.Add(empresa3);
            empresas.Add(empresa4);
            empresas.Add(empresa1);
            empresas.Add(empresa5);


            //----------------------------EMPLEADO-------------------------------------------------
            Empleado empleado1 = new Empleado("John Doe", "Desarrollador", 1, 60000, 1);
            Empleado empleado2 = new Empleado("Jane Smith", "Analista de Datos", 2, 75000, 1);
            Empleado empleado3 = new Empleado("Bob Johnson", "Gerente de Proyecto", 3, 90000, 2);
            Empleado empleado4 = new Empleado("Alice Williams", "Ingeniero de Software", 4, 65000, 2);
            Empleado empleado5 = new Empleado("Charlie Brown", "Diseñador UX", 5, 70000, 3);
            Empleado empleado6 = new Empleado("David Davis", "Especialista en Marketing", 6, 80000, 3);
            Empleado empleado7 = new Empleado("Eva Evans", "Analista Financiero", 7, 85000, 4);
            Empleado empleado8 = new Empleado("Frank Franklin", "Desarrollador Frontend", 8, 70000, 4);
            Empleado empleado9 = new Empleado("Grace Green", "Ingeniero de Redes", 9, 75000, 5);
            Empleado empleado10 = new Empleado("Harry Harrison", "Especialista en Recursos Humanos", 10, 85000, 5);
            Empleado empleado11 = new Empleado("Isabel Rodriguez", "Analista de Sistemas", 11, 78000, 1);
            Empleado empleado12 = new Empleado("Kevin Lee", "Desarrollador Full Stack", 12, 92000, 1);
            Empleado empleado13 = new Empleado("Laura Chen", "Diseñadora Gráfica", 13, 68000, 2);
            Empleado empleado14 = new Empleado("Miguel Sánchez", "Ingeniero de Datos", 14, 86000, 2);
            Empleado empleado15 = new Empleado("Natalia Gomez", "Especialista en Ventas", 15, 75000, 3);
            Empleado empleado16 = new Empleado("Oscar Martinez", "Analista de Marketing", 16, 82000, 3);
            Empleado empleado17 = new Empleado("Patricia Kim", "Contadora", 17, 90000, 4);
            Empleado empleado18 = new Empleado("Quincy Brown", "Desarrollador Mobile", 18, 72000, 4);
            Empleado empleado19 = new Empleado("Rosa Flores", "Ingeniera de Redes", 19, 79000, 5);
            Empleado empleado20 = new Empleado("Samuel Taylor", "Especialista en Recursos Humanos", 20, 88000, 5);

            empleados.Add(empleado1);
            empleados.Add(empleado2);
            empleados.Add(empleado3);
            empleados.Add(empleado4);
            empleados.Add(empleado5);
            empleados.Add(empleado6);
            empleados.Add(empleado7);
            empleados.Add(empleado8);
            empleados.Add(empleado9);
            empleados.Add(empleado10);
            empleados.Add(empleado11);
            empleados.Add(empleado12);
            empleados.Add(empleado13);
            empleados.Add(empleado14);
            empleados.Add(empleado15);
            empleados.Add(empleado16);
            empleados.Add(empleado17);
            empleados.Add(empleado18);
            empleados.Add(empleado19);
            empleados.Add(empleado20);

        }

        private void Ejemplo01()
        {

            // Sacar los empleados que cobran más de 70000
            IEnumerable<Empleado> resultado = from Empleado datosMayores in empleados
                                              where datosMayores.salario > 70000
                                              orderby datosMayores.nombre descending
                                              select datosMayores;

            lbresultadosListBox.Items.Clear();

            foreach (var item in resultado)
            {
                lbresultadosListBox.Items.Add(item);
            }

           
        }

        private void Ejemplo02()
        {
            // Saca solo los empleados de Global Services Co. Los empleados deben cobrar más de 65000
            var resultado2 = from Empleado datosEmpleado in empleados
                             join Empresa datosEmpresa in empresas
                             on datosEmpleado.empresa equals datosEmpresa.id
                             // where datosEmpresa.nombre == "Global Services Co." && datosEmpleado.salario > 75000
                             where datosEmpresa.id == 3
                             select new
                             {
                                 NombreEmpresa = datosEmpresa.nombre,
                                 NombreEmpleado = datosEmpleado.nombre,
                                 SalarioEmpleado = datosEmpleado.salario,
                                 CargoEmpleado = datosEmpleado.cargo
                             };

            foreach (var item in resultado2)
            {
                lbresultadosListBox.Items.Add($"Nombre : {item.NombreEmpleado}   -  Salario: {item.SalarioEmpleado}-  Cargo: {item.CargoEmpleado}  - Empresa: {item.NombreEmpresa}");
            }
        }


        private void Ejercicio01LinQ()
        {

            /* Teniendo la lista de empleados y empresas, tendrás que agrupar las personas con el mismo cargo para mostrarlas de la siguiente forma:

                            < Cargo >
                                 < Nombre > - < Salario >
                                 < Nombre > - < Salario >
                                 < Nombre > - < Salario >
            */
            var resultado = from Empleado listaEmpleados in empleados
                            join Empresa listaEmpresa in empresas
                            on listaEmpleados.id equals listaEmpresa.id
                            select new
                            {
                                
                                NombreEmpresa = listaEmpresa.nombre,
                                Nombre = listaEmpleados.nombre,
                                Cargo = listaEmpleados.cargo,
                                Salario = listaEmpleados.salario
                            };

            lbresultadosListBox.Items.Clear();
            foreach (var item in resultado)
            {
                lbresultadosListBox.Items.Add($"\t Cargo: {item.Cargo} - Empresa: {item.NombreEmpresa}");

                foreach (var item2 in resultado)
                {
                    lbresultadosListBox.Items.Add( $"\n Nombre:{item2.Nombre} - Salario: {item2.Salario}");
                }
            }
        }

        private void MostrarResultados_Click(object sender, RoutedEventArgs e)
        {

            // Ejemplo01();
            // Ejemplo02();
            Ejercicio01LinQ();
           
        }
    }
}
