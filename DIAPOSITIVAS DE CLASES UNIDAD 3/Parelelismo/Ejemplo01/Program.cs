using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejemplo01
{
    class Program
    {
        static void Main(string[] args)
        {
            //Creamos los hilos
            //Hilo 1 [Utilizando un pardon para crear Hilos]
            Task.Factory.StartNew(()=>ProcesoHilo1());
            //Hilo 2 [Forma Tradicional de crear un hilo]
            var t = new Task(() => ProcesoHilo2());
            t.Start();

            //Imprimir mensaje
            Console.WriteLine("Programa Principal!!");
            Console.ReadKey();
        }

        private static void Escribir(char v)
        {
            int ciclo = 1000;
            for (int i = 0; i < ciclo; i++)
            {
                Console.Write(v);
            }
        }

        private static void ProcesoHilo1() {
            int ciclo = 1000;
            for (int i = 0; i < ciclo; i++)
            {
                Console.Write('-');
            }
        }
        private static void ProcesoHilo2()
        {
            int ciclo = 1000;
            for (int i = 0; i < ciclo; i++)
            {
                Console.Write('+');
            }
        }
    }
}
