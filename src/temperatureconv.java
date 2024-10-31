import java.util.Scanner;

class TemperatureConverter {
    
    private double temperaturevalue;
    private String unit;

    public TemperatureConverter(double temperaturevalue, String unit) {
        this.temperaturevalue = temperaturevalue;
        this.unit = unit.toLowerCase(); // Convert unit to lowercase to handle cases
    }

  // methods for conversion of temperatures 
  
    public double celsiusToFahrenheit() {
        return (temperaturevalue * 9/5) + 32;
    }

    public double celsiusToKelvin() {
        return temperaturevalue + 273.15;
    }

    public double fahrenheitToCelsius() {
        return (temperaturevalue - 32) * 5/9;
    }

    
    public double fahrenheitToKelvin() {
        return (temperaturevalue - 32) * 5/9 + 273.15;
    }

    
    public double kelvinToCelsius() {
        return temperaturevalue - 273.15;
    }

    
    public double kelvinToFahrenheit() {
        return (temperaturevalue - 273.15) * 9/5 + 32;
    }
    
    public void convertTemperature(){
        
        switch(unit) {
            
            case "celsius":
                System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", temperaturevalue, celsiusToFahrenheit());
                System.out.printf("%.2f Celsius = %.2f Kelvin\n", temperaturevalue, celsiusToFahrenheit());
                break;
                
            case "fahrenheit":
                System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", temperaturevalue,fahrenheitToCelsius());
                System.out.printf("%.2f Fahrenheit = %.2f Kelvin\n", temperaturevalue,fahrenheitToKelvin());
                break;
            case "kelvin":
                System.out.printf("%.2f Kelvin = %.2f Celsius\n", temperaturevalue,kelvinToCelsius());
                System.out.printf("%.2f Kelvin = %.2f Fahrenheit\n", temperaturevalue,kelvinToFahrenheit());
                break;
                
            default:
                 System.out.println("Invalid input value");
        }
    }
    
	
}

public class temperatureconv
{
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the temperature value: ");
            
            double temperaturevalue = scanner.nextDouble();
            System.out.print("Enter the unit (Celsius, Fahrenheit, Kelvin): ");
            
            String unit = scanner.next();

            // Create a TemperatureConverter object and perform the conversion
            TemperatureConverter temp = new TemperatureConverter(temperaturevalue, unit);
            temp.convertTemperature();
        }
	}
	
}	
	
	
 