using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfApp1MartinSonsecaEduardoExamenCSharp
{
	internal class Ticket
	{

		private String linea;

		public String Linea
		{
			get { return linea; }
			set { linea += value;
			
				NuevaLinea?.Invoke(this, EventArgs.Empty);
			}
		}

		private double total;

		public double Total
		{
			get { return total; }
			set { total = value; }
		}

		public event EventHandler NuevaLinea;
		public event EventHandler NuevoTicket;

		public void IniciarTicket()
		{
			Linea = "Eduardo Market\n" + System.DateTime.Now.ToString("dddd, dd de MMMM de yyyy") + "\n" + System.DateTime.Now.ToString("HH:mm:ss") + "\n" + "**********\n";
		}

		public Ticket()
		{

		}
	}
}
