using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejemplo02
{
    class Program
    {
        static void Main(string[] args)
        {
            String text1 = "Prueba 1", text2 = "Prueba con mayor información 2";

            //Hilos 1
            var tarea1 = new Task<int>(LengthText, text1);
            tarea1.Start();
            //Hilos 2
            Task<int> tarea2 = Task.Factory.StartNew(LengthText, text2);
            //Hilo 3
            Task.Factory.StartNew(() => {
                Console.WriteLine($"Tamaño del texto {text1} es {tarea1.Result}");
                Console.WriteLine($"Tamaño del texto {text2} es {tarea2.Result}");
            });

            //Imprimimos los resultados
            Console.WriteLine("Programa Pricnipal");
            //Establecemos la paus
            Console.ReadKey();
        }

        /// <summary>
        /// Función que permite obtener el tamaño de un texto
        /// </summary>
        /// <param name="obj"></param>
        /// <returns></returns>
        private static int LengthText(Object obj)
        {
            Console.WriteLine($"Tarea con Id {Task.CurrentId} Procesando {obj}");
            return obj.ToString().Length;
        }
    }
}
