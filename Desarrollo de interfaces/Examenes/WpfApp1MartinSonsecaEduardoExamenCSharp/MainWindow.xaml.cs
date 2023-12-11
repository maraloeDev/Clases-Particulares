using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WpfApp1MartinSonsecaEduardoExamenCSharp
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        List<Articulo> articuloList = new List<Articulo>();
        List<Ticket> ticketList = new List<Ticket>();

        Ticket ticket = new Ticket();
        bool cerraSn = false;
        bool ticketIniciado = false;
        public MainWindow()
        {
            InitializeComponent();
            AniadorArticulo();
            lbArticulos.ItemsSource = articuloList;
        }

        public void AniadorArticulo()
        {
            articuloList.Add(new Articulo("Articulo 1", 5.30));
            articuloList.Add(new Articulo("Articulo 2", 10));
            articuloList.Add(new Articulo("Articulo 3", 15.50));
            articuloList.Add(new Articulo("Articulo 4", 20));
            articuloList.Add(new Articulo("Articulo 5", 25.20));
        }

        public void LineNewEvent(Object sender, EventArgs e)
        {
            lbTicket.Items.Clear();
            lbTicket.Items.Add(ticket.Linea);
        }

        private void botNuevo_Click(object sender, RoutedEventArgs e)
        {
            ticketIniciado = true;
            cerraSn = false;
            ticket = new Ticket();
            ticket.NuevaLinea += LineNewEvent;
            ticket.IniciarTicket();
        }

        private void botCerrar_Click(object sender, RoutedEventArgs e)
        {
            if (!cerraSn && ticketIniciado)
            {
                ticket.Linea = "**********\n" + "Total=" + ticket.Total + "€" + "\n";
                cerraSn = true;


            }

        }

        private void lbArticulos_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (!cerraSn && ticketIniciado)
            {

                foreach (Articulo item in articuloList)
                {
                    if (item.ToString() == lbArticulos.SelectedItem.ToString())

                    {
                        ticket.Linea = item.ToString() + "\n";

                        ticket.Total += item.Precio;
                    }

                }
            }


        }

        private void botResumen_Click(object sender, RoutedEventArgs e)
        {
            int numeroTicket = ticketList.Count;
            double total = 0;

            foreach (var item in ticketList)
            {

                total += item.Total;

            }
            MessageBox.Show("Se han creado " + numeroTicket + "\n" + "con  un total de" + total + "€");
        }

        private void botCambio_Click(object sender, RoutedEventArgs e)
        {
            if (cerraSn && ticketIniciado)
            {

                double dineroEntregado = double.Parse(tbEntrega.Text);
                double resta = dineroEntregado - ticket.Total;

                ticket.Linea = "Entregado = " + dineroEntregado.ToString() + "€";
                ticket.Linea = "\nCambio = " + resta + "€";
                ticketIniciado = false;
                ticketList.Add(ticket);

            }

        }
    }

}