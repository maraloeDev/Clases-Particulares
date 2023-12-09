using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfApp1MartinSonsecaEduardoExamenCSharp
{
    internal class Articulo
    {


		private String descripcion;

		public String Descripcion
		{
			get { return descripcion; }
			set { descripcion = value; }
		}

        private double precio;

        public double Precio
        {
            get { return precio; }
            set { precio = value; }
        }

        public override string? ToString()
        {
            return Descripcion + "\t" + Precio + " €";
        }

        public Articulo(String descripcion, double precio)
        {

            this.descripcion = descripcion;
            this.precio = precio;
            
        }
    }
}
