using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfApp1MartinSonsecaEduardoExamenXAML
{
    internal class Articulo
    {

        public string? Referencia { get; set; }
        public string? Descripcion { get; set; }
        public double Precio { get; set; }
        public string? Imagen { get; set; }

        public override string? ToString()
        {
            return Descripcion;
        }
    }
}
