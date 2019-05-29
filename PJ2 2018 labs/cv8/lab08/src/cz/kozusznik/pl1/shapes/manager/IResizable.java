package cz.kozusznik.pl1.shapes.manager;
import cz.kozusznik.pl1.*;
import cz.kozusznik.pl1.shapes.Position;

public interface IResizable {
    Position getSize();
    void resize(int x, int y);
}
