package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public interface Function<T,R> {
    public R apply(T t);

    default <Q> Function<Q,R> compose(Function<Q,T> other){
        return new Function<Q,R>(){
            public R apply(Q q){
                T t = other.apply(q);
                return Function.this.apply(t);
            }
        };
    };

}
