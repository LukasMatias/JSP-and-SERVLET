package meuPacote;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukas
 */
public class FormatandoDatas {
    private DateFormat dateFormat;
    private Date data;

    public FormatandoDatas() {
    
    dateFormat = DateFormat.getDateInstance();
    data = new Date();
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getData() {
        return dateFormat.format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }
     public void setFormato(String formato){
      this.dateFormat = new SimpleDateFormat(formato);
     }
}
