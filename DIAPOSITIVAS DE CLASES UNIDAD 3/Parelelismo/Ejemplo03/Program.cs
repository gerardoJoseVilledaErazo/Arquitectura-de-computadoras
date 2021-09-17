using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Ejemplo03
{
    class Program
    {
        static void Main(string[] args)
        {
            //Declaracion de variables para cancelar procesos
            var cts = new CancellationTokenSource();
            var token = cts.Token;

            //Evento de cancelación
            token.Register(()=> {
                Console.WriteLine($"Proceso Cancelado!!! {Task.CurrentId}");
            });

            //Hilo con cancelación de token
            var hilo1 = new Task(()=>BucleInfinito(ref token), token);
            hilo1.Start();

            Console.ReadKey();
            cts.Cancel();

            //Mostramos el mensaje de finalización del programa
            Console.WriteLine("Programa Principal finalizado!!");
            Console.ReadKey();
        }

        private static void BucleInfinito(ref CancellationToken token)
        {
            int contador = 0;
            bool flag = true;
            while (flag)
            {
                try
                {
                    //Verificamos si existe una solicitud de cancelación
                    token.ThrowIfCancellationRequested();
                }
                catch (Exception)
                {
                    flag = false;
                }
                Console.WriteLine($"{contador++}\t");
            }
        }
    }
}
