package polygons;

import java.util.List;

public class TestSubtyping {
    Polygon[] polyArray;
    Triangle[] triArray;
    List<Polygon> polyList;
    List<Triangle> triList;

    List<? extends Polygon> coPolyList;
    List<? super Polygon> contraPolyList;

}
