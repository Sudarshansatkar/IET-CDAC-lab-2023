
using System.ComponentModel.DataAnnotations;
namespace BOL;



public class Employee { 
   //Data level Validations

   public int Id{get;set;}
   
   //[Required, MaxLength(80)] 


   public string username { get; set; } 

   public string Password{get;set;}
}
