package com.hibernate.demo;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Arrays;


public class LoggerInterceptor extends EmptyInterceptor {
    @Override
    public boolean onFlushDirty(
            Object entity,
            Serializable id,
            Object[] currentState,
            Object[] previousState,
            String[] propertyNames,
            Type[] types) {
        System.out.println( "------------------Entity "+entity.getClass().getSimpleName()+"#"+id+
                " changed from "+Arrays.toString( previousState )+" to "+
                Arrays.toString( currentState )
        );
        return super.onFlushDirty( entity, id, currentState,
                previousState, propertyNames, types
        );
    }
}
