using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RepasoLinQ
{
    internal class Empresa
    {
        public int id { get; set; }
        public string nombre { get; set; }

        public Empresa()
        {

        }

        public Empresa(int id, string nombre)
        {
            this.id = id;
            this.nombre = nombre;
        }
    }
}
