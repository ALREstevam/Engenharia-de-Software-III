package model.notasFiscais;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotaFiscalVenda extends NotaFiscal implements Serializable{

        public String content;

}
