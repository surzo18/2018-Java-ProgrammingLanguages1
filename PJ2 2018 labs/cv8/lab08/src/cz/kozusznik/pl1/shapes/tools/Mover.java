package cz.kozusznik.pl1.shapes.tools;

import cz.kozusznik.pl1.shapes.Position;
import cz.kozusznik.pl1.shapes.manager.CanvasManager;

/*******************************************************************************
 * Třída {@code Přesouvač} slouží k pohybu s instancemi tříd
 * implementujicich rozhraní {@link IMovable}.
 *
 * @author Rudolf Pecinovský
 * @version 2.01, duben 2004
 */
public class Mover {
//== KONSTANTNÍ ATRIBUTY TŘÍDY =================================================

  /** Oočet milisekund mezi dvěma překresleními objektu. */
  private static final int PERIODA = 50;

//== PROMĚNNÉ ATRIBUTY TŘÍDY ===================================================

  /** Počet vytvořených instancí */
  private static int počet = 0;

//== KONSTANTNÍ ATRIBUTY INSTANCÍ ==============================================

  /** Název sestávající z názvu třídy a pořadí instance */
  private final String name;

//== PROMĚNNÉ ATRIBUTY INSTANCÍ ================================================

  /** Specifikuje rychlost posunu objektu daným posunovačem. */
  private double rychlost;

  private CanvasManager CM = CanvasManager.getInstance();
//== PŘÍSTUPOVÉ METODY VLASTNOSTÍ TŘÍDY ========================================
//== OSTATNÍ METODY TŘÍDY ======================================================

//##############################################################################
//== KONSTRUKTORY A TOVÁRNÍ METODY =============================================

  /***************************************************************************
   * Vytvoří přesouvače, který bude přesouvat objekty rychlosti 1.
   */
  public Mover() {
    this(1);
  }

  /***************************************************************************
   * Vytvoří přesouvače, který bude přesouvat objekty zadanou rychlostí. Rychlost
   * je v px za sekundu
   *
   * @param rychlost
   *          Rychlost, kterou bude přesouvač pohybovat
   *          se svěřenými objekty.
   */
  public Mover(double rychlost) {
    if (rychlost <= 0) {
      throw new IllegalArgumentException("Zadaná rychlost musí byt nezáporná!");
    }
    this.rychlost = (rychlost / 1000) * PERIODA;
    name =
        getClass().getName() + "(ID=" + ++počet + ",rychlost=" + rychlost + ")";
  }

//== PŘÍSTUPOVÉ METODY VLASTNOSTÍ INSTANCÍ =====================================
//== PŘEKRYTÉ METODY IMPLEMENTOVANÝCH ROZHRANÍ =================================
//== PŘEKRYTÉ ABSTRAKTNÍ METODY RODIČOVSKÉ TŘÍDY ===============================
//== PŘEKRYTÉ KONKRÉTNÍ METODY RODIČOVSKÉ TŘÍDY ================================

  /***************************************************************************
   * Metoda převádí instanci na řetězec -
   * používá se většinou pro účely ladění.
   * Mela by ji definovat každá třída a uvést v ni
   * všechny potřebné informace o vnitřním stavu instance.
   *
   * @return Řetězec informující o vnitřním stavu instance
   */
  @Override
  public String toString() {
    return name;
  }

//== NOVĚ ZAVEDENÉ METODY INSTANCÍ =============================================

  /***************************************************************************
   * Přesune zadaný objekt o požadovaný počet bodů.
   *
   * @param object
   *          Přesouvaný objekt
   * @param toRight
   *          Počet bodů, o než se objekt přesune doprava
   * @param toDown
   *          Počet bodů, o než se objekt přesune dolů
   */
  public void move(IMovable object, int toRight, int toDown) {
//        if( ! (objekt instanceof IPaintable) ) {
//            throw new IllegalArgumentException(
//                "Přesouvat se smí jen kreslitelné objekty" );
//        }
//        IPaintable ik = (IPaintable)objekt;

    double distance = Math.sqrt((toRight * toRight) + (toDown * toDown));
    int steps = (int) (distance / rychlost);
    double dx = (toRight + .4) / steps;
    double dy = (toDown + .4) / steps;
    Position p = object.getPosition();
    double x = p.getX() + .4;
    double y = p.getY() + .4;

//        SP.přidej( ik );
    for (int i = steps; i > 0; i--) {
      x = x + dx;
      y = y + dy;
      CM.noPaint();
      object.setPosition((int) x, (int) y);
      CM.returnPaint();
      CM.repaint();
      cz.kozusznik.pl1.utils.IO.wait(PERIODA);
    }
  }

  /***************************************************************************
   * Přesune zadaný objekt o požadovaný počet bodů.
   *
   * @param object
   *          Přesouvaný objekt
   * @param movement
   *          Počet bodů, o než se objekt přesune doprava a dolů
   *          uložený v přepravce
   */
  public void moveBy(IMovable object, Position movement) {
    move(object, movement.x, movement.y);
  }

  /***************************************************************************
   * Přesune zadaný objekt do požadované pozice.
   *
   * @param object
   *          Přesouvaný objekt
   * @param x
   *          x-ova souřadnice požadované cílové pozice
   * @param y
   *          y-ova souřadnice požadované cílové pozice
   */
  public void moveOn(IMovable object, int x, int y) {
    Position p = object.getPosition();
    move(object, x - p.x, y - p.y);
  }

  /***************************************************************************
   * Přesune zadaný objekt do požadované pozice.
   *
   * @param object
   *          Přesouvaný objekt
   * @param position
   *          Požadované cílové pozice.
   */
  public void moveOn(IMovable object, Position position) {
    moveOn(object, position.x, position.y);
  }

//== SOUKROMÉ A POMOCNÉ METODY TŘÍDY ===========================================
//== SOUKROMÉ A POMOCNÉ METODY INSTANCÍ ========================================
//== VNOŘENÉ A VNITŘNÍ TŘÍDY ===================================================
//== TESTY A METODA MAIN =======================================================
}
