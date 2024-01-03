namespace Util;
using System.Threading;
public static class Helper{
 
        public static  async  Task  StoreData(){
         
              await Task.Run(()=>{
                for(int i=0;i<5;i++){
                         Console.WriteLine("Bhupesh ");
                         
                }
                   
                    Console.WriteLine(Thread.CurrentThread.ManagedThreadId);
            });
        }

        public static  async  Task  GetRemoteData(){
             await Task.Run(()=>{
                Console.WriteLine("Pranay");
                 Console.WriteLine(Thread.CurrentThread.ManagedThreadId);
            });
        }


}