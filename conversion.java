/** *****************************************************************
    conversion.java
    Converts various measures from one unit to another

    @author Jeff Offutt & Ren Li

        @version 1.0    October 2000
        @version 2.0    June 2015
        @version 2.1    January 2020
********************************************************************* */
// Import Servlet Libraries
// import javax.servlet.*;
// import javax.servlet.http.*;

// Import Java Libraries
import java.io.*;
import java.util.*;
import java.lang.*;

// conversion class
//
// CONSTRUCTOR: no constructor specified (default)
//
// ****************  PUBLIC OPERATIONS  **********************************
// void  doGet()      --> Uses PrintHead() and PrintForm() to print the screen
// void  PrintHead()  --> Generates the head of the web page
// void  PrintForm()  --> Generates the form of the web page
// void  doPost()     --> Handles the conversions
// float convertX2Y() --> One for each conversion pair
//*************************************************************************
//
// The possible IOException on the PrintWriter is thrown up.

// public class conversion extends HttpServlet
// {

public class conversion {

// public void doGet (HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException
// {  // Prints the form initially with no values
//    response.setContentType ("TEXT/HTML");
//    PrintWriter out = response.getWriter ();
//    PrintHead (response);
//    // Needed for PrintForm, but empty is okay.
//    Properties newvals = new Properties ();
//    PrintForm (response, newvals);
// }


// private void PrintHead (HttpServletResponse response)
//    throws ServletException, IOException
// {
//    PrintWriter out=response.getWriter ();
//    out.println ("<html>");
//    out.println ("<head>");
//    out.println ("<title>Measurement units conversion</title>");

//    out.println (" <script language=\"JavaScript\">");
//    out.println ("");
//    out.println (" <!--");
//    out.println (" // Function borrowed from Thilo Rusche");
//    out.println (" function ClearForm()");
//    out.println (" {  // Set all the form values to blank.");
//    out.println ("    var form = document.forms[0];");
//    out.println ("    for (i=0; i < form.elements.length; i++)");
//    out.println ("    {");
//    out.println ("       if (form.elements[i].name != \"submit\" &&");
//    out.println ("           form.elements[i].name != \"clear\")");
//    out.println ("           form.elements[i].value = \"\";");
//    out.println ("  }");
//    out.println ("  return false;");
//    out.println (" }");
//    out.println (" //-->");
//    out.println (" </script>");

//    out.println ("</head>");
//    out.println ("<body>");
//    out.println ("<center><h2>On-line Measurement Conversion</h2></center>");
//    out.println ("Jeff Offutt and Ren Li");
//    out.println ("<hr>");
// }


// private void PrintForm (HttpServletResponse response, Properties newvals)
//    throws ServletException, IOException
// {
//    response.setContentType ("text/html");
//    PrintWriter out=response.getWriter ();

//    out.print   ("<form method=\"post\"");
//    out.println (" action=\"https://cs.gmu.edu:8443/offutt/servlet/conversion\">");
//    out.println (" <p>");
//    out.println (" <table cellspacing=0 cellpadding=5 border=0");
//    out.print   ("  align=center>");
//    out.println (" <tr align=right>");
//    out.print   ("  <td><b>Fahrenheit  (F&#186;):</b> ");
//    out.print   ("  <input type=\"text\" name=\"F\" size=6 value=\"");
//    // New: Add the value from the newvals container.
//    if (newvals.getProperty ("F") != null)
//       out.print (newvals.getProperty ("F"));
//     out.println ("\"></td>");

//    out.println ("  <td><-----></td>");
//    out.println ("  <td><b>Celsius (C&#186;):</b> ");
//    out.print   ("  <input type=\"text\" name=\"C\" size=6 value=\"");
//    if (newvals.getProperty ("C") != null)
//       out.print (newvals.getProperty ("C"));
//     out.println ("\"></td>");

//    out.println (" <tr align=right>");
//    out.println ("  <td><b>Inch (in):</b> ");
//    out.print   ("  <input type=\"text\" name=\"in\" size=6 value=\"");
//    if (newvals.getProperty ("in") != null)
//       out.print (newvals.getProperty ("in"));
//     out.println ("\"></td>");

//    out.println ("  <td><-----></td>");
//    out.println ("  <td><b>Centimeter (cm):</b> ");
//    out.print   ("  <input type=\"text\" name=\"cm\" size=6 value=\"");
//    if (newvals.getProperty ("cm") != null)
//       out.print (newvals.getProperty ("cm"));
//     out.println ("\"></td>");

//    out.println (" <tr align=right>");
//    out.println ("  <td><b>Feet (ft):</b> ");
//    out.print   ("  <input type=\"text\" name=\"ft\" size=6 value=\"");
//    if (newvals.getProperty ("ft") != null)
//       out.print (newvals.getProperty ("ft"));
//     out.println ("\"></td>");

//    out.println ("  <td><-----></td>");
//    out.println ("  <td><b>Meter (m):</b> ");
//    out.print   ("  <input type=\"text\" name=\"m\" size=6 value=\"");
//    if (newvals.getProperty ("m") != null)
//       out.print (newvals.getProperty ("m"));
//     out.println ("\"></td>");

//    out.println (" <tr align=right>");
//    out.println ("  <td><b>Mile (mi):</b> ");
//    out.print   ("  <input type=\"text\" name=\"mi\" size=6 value=\"");
//    if (newvals.getProperty ("mi") != null)
//       out.print (newvals.getProperty ("mi"));
//     out.println ("\"></td>");

//    out.println ("  <td><-----></td>");
//    out.println ("  <td><b>Kilometer (km):</b> ");
//    out.print   ("  <inpUt type=\"text\" name=\"km\" size=6 value=\"");
//    if (newvals.getProperty ("km") != null)
//       out.print (newvals.getProperty ("km"));
//     out.println ("\"></td>");

//    out.println (" <tr align=right>");
//    out.println ("  <td><b>Gallon (gal):</b> ");
//    out.print   ("  <input type=\"text\" name=\"gal\" size=6 value=\"");
//    if (newvals.getProperty ("gal") != null)
//       out.print (newvals.getProperty ("gal"));
//     out.println ("\"></td>");

//    out.println ("  <td><-----></td>");
//    out.println ("  <td><b>Liter (L):</b> ");
//    out.print   ("  <input type=\"text\" name=\"L\" size=6 value=\"");
//    if (newvals.getProperty ("L") != null)
//       out.print (newvals.getProperty ("L"));
//     out.println ("\"></td>");

//    out.println (" <tr align=right>");
//    out.println ("  <td><b>Ounce (oz):</b> ");
//    out.print   ("  <input type=\"text\" name=\"oz\" size=6 value=\"");
//    if (newvals.getProperty ("oz") != null)
//       out.print (newvals.getProperty ("oz"));
//     out.println ("\"></td>");

//    out.println ("  <td><-----></td>");
//    out.println ("  <td><b>Gram (g):</b> ");
//    out.print   ("  <input type=\"text\" name=\"g\" size=6 value=\"");
//    if (newvals.getProperty ("g") != null)
//       out.print (newvals.getProperty ("g"));
//     out.println ("\"></td>");

//    out.println (" <tr align=right>");
//    out.println ("  <td><b>Pound (lb):</b> ");
//    out.print   ("  <input type=\"text\" name=\"lb\" size=6 value=\"");
//    if (newvals.getProperty ("lb") != null)
//       out.print (newvals.getProperty ("lb"));
//     out.println ("\"></td>");

//    out.println ("  <td><-----></td>");
//    out.println ("  <td><b>Kilogram (kg):</b> ");
//    out.print   ("  <input type=\"text\" name=\"kg\" size=6 value=\"");
//    if (newvals.getProperty ("kg") != null)
//       out.print (newvals.getProperty ("kg"));
//     out.println ("\"></td>");

//    out.println (" </table>");
//    out.print   (" <table cellspacing=0 cellpadding=10");
//    out.println ("   BORDER=0 ALIGN=center WIDTH=\"50%\">");
//    out.println ("  <tr align=center>");
//    out.println ("   <td><input name=\"submit\" type=\"submit\" value=\"Convert\"></td>");
//    out.println ("   <td><input name=\"clear\" type=\"button\" value=\"Clear Form\"");
//    out.println ("              onClick=\"ClearForm()\"></td>");
//    out.println ("  </tr>");
//    out.println (" </table>");
//    out.println ("</form>");
//    out.println ("<p>");

//    out.println ("<hr>");

//    out.println ("</body>");
//    out.println ("</html>");
//    out.close ();
// }

/** *****************************************************
 *  Overrides HttpServlet's doPost().
 *  Converts each entry in the form and prints the results
 *  at the top of an HTML page.
 *  The new values are printed in red (#FF0000).
********************************************************* */

// public void doPost (HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException
// {
//    response.setContentType("TEXT/HTML");
//    PrintWriter out = response.getWriter();

//    PrintHead(response);

//    // Get the values from the textboxes in the form
//    // Most are probably empty
//    String FAsStr   = request.getParameter("F");
//    String CAsStr   = request.getParameter("C");
//    String inAsStr  = request.getParameter("in");
//    String cmAsStr  = request.getParameter("cm");
//    String ftAsStr  = request.getParameter("ft");
//    String mAsStr   = request.getParameter("m");
//    String miAsStr  = request.getParameter("mi");
//    String kmAsStr  = request.getParameter("km");
//    String galAsStr = request.getParameter("gal");
//    String LAsStr   = request.getParameter("L");
//    String ozAsStr  = request.getParameter("oz");
//    String gAsStr   = request.getParameter("g");
//    String lbAsStr  = request.getParameter("lb");
//    String kgAsStr  = request.getParameter("kg");

//    int n; // temporary number
//    float num1, num2; // temporary numbers

//    // Save the converted values into a container to add to form
//    Properties newvals = new Properties();

//    // temperature
//    if (FAsStr != null && FAsStr.length() > 0)
//    {  // Convert farenheit to celsius
//       newvals.put("C", String.valueOf(convertF2C(FAsStr)));
//    }
//    if  (CAsStr != null && CAsStr.length() > 0)
//    {  // Convert celsius to farenheit
//       newvals.put("F", String.valueOf(convertC2F(CAsStr)));
//    }

//    // small distance
//    if  (inAsStr != null && inAsStr.length() > 0)
//    {  // Convert inches to centimeters
//       newvals.put("cm", String.valueOf(convertIn2Cm(inAsStr)));
//    }
//    if  (cmAsStr != null && cmAsStr.length() > 0)
//    {  // Convert centimeters to inches
//       newvals.put("in", String.valueOf(convertCm2In(cmAsStr)));
//    }

//    // medium distance
//    if  (ftAsStr != null && ftAsStr.length() > 0)
//    {  // Convert feet to meters
//       newvals.put("m", String.valueOf(convertF2M(ftAsStr)));
//    }
//    if  (mAsStr != null && mAsStr.length() > 0)
//    {  // Convert meters to feet
//       newvals.put("ft", String.valueOf(convertM2F(mAsStr)));
//    }

//    // large distance
//    if  (miAsStr != null && miAsStr.length() > 0)
//    {  // Convert miles to kilometers
//       newvals.put("km", String.valueOf(convertM2K(miAsStr)));
//    }
//    if  (kmAsStr != null && kmAsStr.length() > 0)
//    {  // Convert kilometers to miles
//       newvals.put("mi", String.valueOf(convertK2M(kmAsStr)));
//    }

//    // volume
//    if (galAsStr != null && galAsStr.length() > 0)
//    {  // Convert gallons to liters
//       newvals.put("L", String.valueOf(convertG2L(galAsStr)));
//    }
//    if  (LAsStr != null && LAsStr.length() > 0)
//    {  // Convert liters to gallons
//       newvals.put("gal", String.valueOf(convertL2G(LAsStr)));
//    }

//    // small weight
//    if  (ozAsStr != null && ozAsStr.length() > 0)
//    {  // Convert ounces to grams
//       newvals.put("g", String.valueOf(convertOz2G(ozAsStr)));
//    }
//    if  (gAsStr != null && gAsStr.length() > 0)
//    {  // Convert grams to ounces
//       newvals.put("oz", String.valueOf(convertG2Oz(gAsStr)));
//    }

//    // medium weight
//    if (lbAsStr != null && lbAsStr.length() > 0)
//    {  // Convert pounds to kilograms
//       newvals.put("kg", String.valueOf(convertLb2K(lbAsStr)));
//    }
//    if (kgAsStr != null && kgAsStr.length() > 0)
//    {  // Convert kilograms to pounds
//       newvals.put("lb", String.valueOf(convertK2Lb(kgAsStr)));
//    }

//    PrintForm (response, newvals);

//    out.close ();
// }

// round to 2 digits 
public float round (float input){
   int n = Math.round(input * 100.0f); 
   float num1 = (float) (n / 100.0f); 
   return num1; 
}

// 1) fahrenheit to celsius
public float convertF2C (float fahrenheit){ 
   return ((fahrenheit - 32.0f) * 5.0f) / 9.0f; 
}

// 2) celsius to fahrenheit
public float convertC2F (float celsius){ 
   return (celsius * 9.0f / 5.0f) + 32.0f; 
}

// 3) inches to centimeters
public float convertIn2Cm (float inches){ 
   return inches * 2.54f; 
}

// 4) centimeters to inches 
public float convertCm2In (float centimeters){ 
   return centimeters / 2.54f; 
}

// 5) feet to meters 
public float convertF2M (float feet){ 
   return feet / 3.281f; 
}

// 6) meters to feet 
public float convertM2F (float meters){
   return meters * 3.281f; 
}

// 7) miles to kilometers
public float convertM2K (float miles){
   return miles *  1.609f; 
}

// 8) kilometers to miles 
public float convertK2M (float kilometers){ 
   return kilometers / 1.609f; 
}

// 9) gallons to liters 
public float convertG2L (float gallons){  
   return gallons * 3.785f; 
}

// 10) liters to gallons  
public float convertL2G (float liters){  
   return liters / 3.785f; 
}

// 11) ounces to grams 
public float convertOz2G (float ounces){  
   return ounces * 28.35f; 
}

// 12) grams to ounces 
public float convertG2Oz (float grams){
   return grams / 28.35f; 
}

// 13) lbs to kgs 
public float convertLb2K (float lbs){  
   return lbs * 0.4536f; 
}

// 14) kgs to lbs
public float convertK2Lb(float kilograms) { 
   return kilograms * 2.20462f; 
}

// 15) hours to seconds 
public float convertH2S(float hours){
   return hours * 3600.0f; 
}

// 16) seconds to hours 
public float convertS2H(float seconds){
   return seconds / 3600.0f; 
}

public float accuracy(float val, int accuracy){
   //NOTE: this method will only work if the amount of decimal places in 'val' is greater than 'accuracy'
   if(accuracy > 4 || accuracy < 0){
      throw new IllegalArgumentException("Accuracy must be in the range of 0 to 4!");
   }
   // convert string to float value
   float num1 = val; 
   float n = Math.round(num1 * Math.pow(10.0, accuracy));
   num1 = (float) (n/Math.pow(10.0, accuracy));
   return num1; 
}


public void menu(){
   System.out.println("\n---------------------------MENU---------------------------");
   System.out.println("Enter 1 to convert Fahrenheit to Celsius");
   System.out.println("Enter 2 to convert Celsius to Fahrenheit");
   System.out.println("Enter 3 to convert inches to centimeters");
   System.out.println("Enter 4 to convert centimeters to inches");
   System.out.println("Enter 5 to convert feet to meters");
   System.out.println("Enter 6 to convert meters to feet");
   System.out.println("Enter 7 to convert miles to kilometers");
   System.out.println("Enter 8 to convert kilometers to miles");
   System.out.println("Enter 9 to convert gallons to liters");
   System.out.println("Enter 10 to convert liters to gallons");
   System.out.println("Enter 11 to convert ounces to grams");
   System.out.println("Enter 12 to convert grams to ounces");
   System.out.println("Enter 13 to convert pounds to kilograms");
   System.out.println("Enter 14 to convert kilograms to pounds");
   System.out.println("Enter 15 to convert hours to seconds");
   System.out.println("Enter 16 to convert seconds to hours");
   System.out.println("Enter 0 to exit");
   System.out.println("----------------------------------------------------------\n");
}

// retrieves the user's choice from 0 to 16 
public int getChoice(){
   Scanner scanner = new Scanner(System.in); 
   // User input their choice by entering a value
   int choice = scanner.nextInt();
   float input = 0;
   int num = 0;
   while (choice < 0 || choice > 16) {
      System.out.println("\nInvalid input. Please try again.");
      choice = scanner.nextInt();
   }
   return choice;   
}

public float valueToConvert(){
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter in the value to convert");
   float res = scanner.nextFloat();
   return res;
}

public String printOut(float input, int num, int choice){
   conversion instance = new conversion(); 
   // trigger function call depending on user input 
   if(choice == 1)
      return("\n" + input +" Fahrenheit -> " + instance.accuracy(instance.convertF2C(input),num) + " Celsius" );
   else if (choice == 2)
      return ("\n" + input +" Celsius -> " + instance.accuracy(instance.convertC2F(input),num) + " Fahrenheit" );
   else if (choice == 3)
      return ("\n" + input +" Inches -> " + instance.accuracy(instance.convertIn2Cm(input),num) + " Centimeters" );
   else if (choice == 4)
      return ("\n" + input +" Centimeters -> " + instance.accuracy(instance.convertCm2In(input),num) + " Inches" );
   else if (choice == 5)
      return ("\n" + input +" Feet -> " + instance.accuracy(instance.convertF2M(input),num) + " Meters" );
   else if (choice == 6)
      return ("\n" + input +" Meters -> " + instance.accuracy(instance.convertM2F(input),num) + " Feet" );
   else if (choice == 7)
      return ("\n" + input +" Miles -> " + instance.accuracy(instance.convertM2K(input),num) + " Kilometers" );
   else if (choice == 8)
      return ("\n" + input +" Kilometers -> " + instance.accuracy(instance.convertK2M(input),num) + " Miles" );
   else if (choice == 9)
      return ("\n" + input +" Gallons -> " + instance.accuracy(instance.convertG2L(input),num) + " Liters" );
   else if (choice == 10)
      return ("\n" + input +" Liters -> " + instance.accuracy(instance.convertL2G(input),num) + " Gallons" );
   else if (choice == 11)
      return ("\n" + input +" Ounces -> " + instance.accuracy(instance.convertOz2G(input),num) + " Grams" );
   else if (choice == 12)
      return ("\n" + input +" Grams -> " + instance.accuracy(instance.convertG2Oz(input),num) + " Ounces" );
   else if (choice == 13)
      return ("\n" + input +" Pounds -> " + instance.accuracy(instance.convertLb2K(input),num) + " Kilograms" );
   else if (choice == 14)
      return ("\n" + input +" Kilograms -> " + instance.accuracy(instance.convertK2Lb(input),num) + " Pounds" );
   else if (choice == 15)
      return ("\n" + input +" Hours -> " + instance.accuracy(instance.convertH2S(input),num) + " Seconds" );
   else if (choice == 16)
      return ("\n" + input +" Seconds -> " + instance.accuracy(instance.convertS2H(input),num) + " Hours" );
   else if (choice == 0)
         return ("--- Exiting Program. ---\n");
   else 
      return ("\nInvalid input. Please try again.\n");
}

public int getDecimal(){
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter in digits after the decimal point (0-4)");
   int num = scanner.nextInt();
   while (num < 0 || num > 4) {
      System.out.println("Out of range, try again");
      num = scanner.nextInt();
   }
   return num;
}

public static void main(String[] args){
   conversion instance = new conversion(); 
   while(true){
      //print menu - void
      instance.menu();
      //choice - return int
      int choice = instance.getChoice();
      if(choice == 0){
         System.out.println("--- Exiting Program. ---\n");
         break;
      }
      //value to convert - return int
      float value = instance.valueToConvert();
      //decimal place - retunr int
      int num = instance.getDecimal();
      //print out converted value
      System.out.println(instance.printOut(value, num, choice));
   }
}
}