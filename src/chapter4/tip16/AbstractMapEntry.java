package chapter4.tip16;

import java.util.Map;

/**
 * Created by snakecc on 14-3-18.
 */
public abstract class AbstractMapEntry implements Map.Entry{
    @Override
    public abstract Object getKey() ;

    @Override
    public abstract Object getValue() ;

    @Override
    public Object setValue(Object value) {
        throw new UnsupportedOperationException();
    }
}
