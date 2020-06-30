
import java.io.IOException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukas
 */
public class desenvolvendoTaglibs extends TagSupport{
    
    
    public int doStartTag() throws JspTagException{
        try {
            pageContext.getOut().print("Desenvolvendo com taglib");
        } catch (IOException ioe) {
            throw new JspTagException("Erro: IOException");
        }
        return SKIP_BODY;
    }
    
}
