package it.dipendenzecircolari.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanA {

    /**
     * 1° SOLUZIONE CON INIZIALIZZAZIONE @LAZY
     * QUANDO IL BEAN VIENE REFERENZIATO, SI INIETTA UN PROXY NEL BeanA
     */
//    private BeanB beanB;
//    public BeanA(@Lazy BeanB beanB) {
//        super();
//        this.beanB = beanB;
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 2° SOLUZIONE CON GET E SET
     * IL BEAN VIENE INIZIALIZZATO SUCCESSIVAMENTE CON SET
     */
//    private BeanB beanB;
//    public BeanB getBeanB() {
//        return beanB;
//    }
//
//    @Autowired
//    public void setBeanB(BeanB beanB) {
//        this.beanB = beanB;
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 3° SOLUZIONE CON @PostConstruct
     */
    @Autowired
    private BeanB beanB;

    @PostConstruct
    void init() {
        beanB.setBeanA(this);
    }


}
