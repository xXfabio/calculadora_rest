package br.com.lobo.verbo.exeptions;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String details;

    
    
}
