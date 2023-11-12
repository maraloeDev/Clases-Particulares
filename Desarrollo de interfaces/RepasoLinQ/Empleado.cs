using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RepasoLinQ
{
    internal class Empleado
    {

        public string nombre { get; set; }
        public string cargo { get; set; }
        public int id{ get; set; }
        public double salario { get; set; }
        public int empresa { get; set; }

    public Empleado(string nombre, string cargo, int id, double salario, int empresa)
        {
            this.nombre = nombre;
            this.cargo = cargo;
            this.id = id;
            this.salario = salario;
            this.empresa = empresa;
        }

        public Empleado()
        {
            
        }
    }

}
