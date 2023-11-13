using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosLinQ
{
    internal class Venta
    {

        public int VentaId { get; set; }
        public int ClienteId { get; set; }
        public int EmpresaId { get; set; }
        public double Monto { get; set; }

    }
}
