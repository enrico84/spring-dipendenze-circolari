package it.dipendenzecircolari.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private BeanA beanA;

    /**
     * 1° SOLUZIONE CON INIZIALIZZAZIONE LAZY
     * QUANDO IL BEAN VIENE REFERENZIATO, SI INIETTA UN PROXY NEL BeanB
     */
//    public BeanB(BeanA beanA) {
//        super();
//        this.beanA = beanA;
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 2° SOLUZIONE CON GET E SET
     * IL BEAN VIENE INIZIALIZZATO SUCCESSIVAMENTE CON SET
     * @return
     */
//    public BeanA getBeanA() {
//        return beanA;
//    }
//
//    @Autowired
//    public void setBeanA(BeanA beanA) {
//        this.beanA = beanA;
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 3° SOLUZIONE IL BeanA utilizza @PostConstruct
     */
    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }
}
