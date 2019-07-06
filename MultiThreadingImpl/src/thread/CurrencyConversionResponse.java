/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author MaySM
 */
public class CurrencyConversionResponse {
    private String base;
    private String date;
    private Map<String, String> rates = new TreeMap<>();
    
    public Map<String, String> getRates(){
        return rates;
    }
    public void setRates (Map<String, String> rates) {
        this.rates = rates;
    }
    public String getbase() {
        return base;
    }
    public void setBase (String base) {
        this.base = base;
    }
    public String geDate() {
        return date;
    }
    public void setDate (String Date) {
        this.date = date;
    }
}
