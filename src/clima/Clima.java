/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clima;

/**
 *
 * @author usuario
 */
public class Clima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux = "<Temperature>";
        int indece1 = getWeather("Torrejon", "Spain").lastIndexOf(aux);
        int indece2 = getWeather("Torrejon", "Spain").indexOf("</Temperature>");
        String temperatura=getWeather("Torrejon", "Spain").substring(indece1 +aux.length(), indece2);
        String temp = temperatura.substring(temperatura.indexOf("("));
        System.out.println(temp);
    }

    private static String getWeather(java.lang.String cityName, java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
        return port.getWeather(cityName, countryName);
    }

    private static String getCitiesByCountry(java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
        return port.getCitiesByCountry(countryName);
    }

    private static String getCitiesByCountry_1(java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        return port.getCitiesByCountry(countryName);
    }

}
