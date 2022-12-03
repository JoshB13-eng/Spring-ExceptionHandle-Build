
package JoshA.Exception;

import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.ControllerAdvice; 
import org.springframework.web.bind.annotation.ExceptionHandler; 


@ControllerAdvice 
//@ControllerAdvice annotation tells that a class will generally manage exception
public class FruitExceptionController{   
    
    
    @ExceptionHandler(value = FruitNotFoundException.class)  
    //@ExceptionHandler annotation tells that a method will specifically manage exception
    public ResponseEntity<Object> FNFexception(FruitNotFoundException exception){   
        //
        return new ResponseEntity<>("Product not found\n", HttpStatus.NOT_FOUND); 
        //
        
    } 
    
    @ExceptionHandler(value = FruitNotAccessible.class)
    //@ExceptionHandler annotation tells that a method will specifically manage exception
    public ResponseEntity<Object> FNAexception(FruitNotAccessible exception){
        //
        return new ResponseEntity<>("Product not accessible\n", HttpStatus.NOT_FOUND); 
        
    }
}