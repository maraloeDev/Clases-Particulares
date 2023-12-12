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

namespace WpfApp1MartinSonsecaEduardoExamenXAML
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            Recuperar();
        }

        private void Recuperar() 
        {
            Datos.RecuperarArticulos();
            lbDatos.ItemsSource = Datos.Articulos;
            labelRef.Content = Datos.Articulos[0].Referencia;
            labelPrecio.Content = Datos.Articulos[0].Precio + "€";
        }

        private void lbDatos_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

            foreach (var item in Datos.Articulos)
            {

                if (lbDatos.SelectedItem.ToString() == item.ToString())
                {
                    labelRef.Content = item.Referencia;
                    labelPrecio.Content = item.Precio + "€";
                }
                
            }
        }
    }
}