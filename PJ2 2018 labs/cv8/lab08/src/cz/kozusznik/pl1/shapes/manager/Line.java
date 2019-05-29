package cz.kozusznik.pl1.shapes.manager;

import cz.kozusznik.pl1.shapes.MyColor;
import cz.kozusznik.pl1.shapes.Position;

/*******************************************************************************
 * Třída pro prací s čárou komunikující s aktivním plátnem.
 * Čára je určena svými krajními body, přičemž souřadnice počátečního bodu
 * je současně považována za pozici celé instance.
 * Jedná se o výchozí podobu třídy v souboru projektů.
 *
 * @author Rudolf Pecinovský
 * @version 2.01, duben 2004
 */
public class Line implements IPaintable {
//== KONSTANTNÍ ATRIBUTY TŘÍDY =================================================

  /**
   * Počáteční barva nakreslené instance v případě,
   * kdy uživatel žádnou požadovanou barvu nezadá -
   * pro čáru Barva.ČERNÁ.
   */
  public static final MyColor DEFAULT_COLOR = MyColor.BLACK;

  /** Aktivní plátno, které dohlíží na správné vykreslení instance. */
  private static final CanvasManager CM = CanvasManager.getInstance();

//== PROMĚNNÉ ATRIBUTY TŘÍDY ===================================================

  /** Počet vytvořených instancí */
  private static int count = 0;

//== KONSTANTNÍ ATRIBUTY INSTANCÍ ==============================================

  /** Název sestávající z názvu třídy a pořadí instance */
  private final String name;

//== PROMĚNNÉ ATRIBUTY INSTANCÍ ================================================

  private int xPos; //Bodová x-ová souřadnice počátku
  private int yPos; //Bodová y-ová souřadnice počátku
  private int kx; //xBodová -ová souřadnice konce
  private int ky; //Bodová y-ová souřadnice konce
  private MyColor color; //Barva instance

//== PŘÍSTUPOVÉ METODY VLASTNOSTÍ TŘÍDY ========================================
//== OSTATNÍ METODY TŘÍDY ======================================================

//##############################################################################
//== KONSTRUKTORY A TOVÁRNÍ METODY =============================================

  /***************************************************************************
   * Vytvoří novou instanci se zadanou polohou a rozměry
   * a implicitní barvou.
   *
   * @param x
   *          x-ová souřadnice počátku, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice počátku, y=0 má horní okraj plátna
   * @param kx
   *          x-ová souřadnice koncového bodu
   * @param ky
   *          y-ová souřadnice koncového bodu
   */
  public Line(int x, int y, int kx, int ky) {
    this(x, y, kx, ky, DEFAULT_COLOR);
  }

  /***************************************************************************
   * Vytvoří novou instanci se zadanou polohou a rozměry
   * a implicitní barvou.
   *
   * @param start
   *          Pozice počátku instance
   * @param end
   *          Pozice koncového bodu instance
   */
  public Line(Position start, Position end) {
    this(start.x, start.y, end.x, end.y, DEFAULT_COLOR);
  }

  /***************************************************************************
   * Vytvoří novou instanci se zadanou polohou a rozměry
   * a implicitní barvou.
   *
   * @param start
   *          Pozice počátku instance
   * @param end
   *          Pozice koncového bodu instance
   * @param color
   *          Barva vytvářené instance
   */
  public Line(Position start, Position end, MyColor color) {
    this(start.x, start.y, end.x, end.y, color);
  }

  /***************************************************************************
   * Vytvoří novou instanci se zadanými rozměry, polohou a barvou.
   *
   * @param x
   *          x-ová souřadnice počátku, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice počátku, y=0 má horní okraj plátna
   * @param kx
   *          x-ová souřadnice koncového bodu
   * @param ky
   *          y-ová souřadnice koncového bodu
   * @param color
   *          Barva vytvářené instance
   */
  public Line(int x, int y, int kx, int ky, MyColor color) {
    name = this.getClass().getSimpleName() + "_" + ++count;
    xPos = x;
    yPos = y;
    this.kx = kx;
    this.ky = ky;
    this.color = color;
  }

//== PŘÍSTUPOVÉ METODY ATRIBUTU INSTANCÍ =======================================

  /***************************************************************************
   * Vrátí x-ovou souřadnici pozice instance.
   *
   * @return x-ová souřadnice.
   */
  public int getX() {
    return xPos;
  }

  /***************************************************************************
   * Vrátí y-ovou souřadnici pozice instance.
   *
   * @return y-ová souřadnice.
   */
  public int getY() {
    return yPos;
  }

  /***************************************************************************
   * Vrátí instanci třídy Pozice s pozicí instance.
   *
   * @return Pozice s pozicí instance.
   */
  public Position getPosition() {
    return new Position(xPos, yPos);
  }

  /***************************************************************************
   * Nastaví novou pozici instance.
   * Koncový bod se přitom přesune tak,
   * aby zůstala zachována velikost a směr instance.
   *
   * @param x
   *          Nová x-ová pozice instance
   * @param y
   *          Nová y-ová pozice instance
   */
  public void setPosition(int x, int y) {
    kx += x - xPos;
    xPos = x;
    ky += y - yPos;
    yPos = y;
    CM.repaint();
  }

  /***************************************************************************
   * Nastaví novou pozici instance.
   *
   * @param position
   *          Nová pozice instance
   */
  public void setPosition(Position position) {
    setPosition(position.x, position.y);
  }

  /***************************************************************************
   * Vrátí x-ovou souřadnici koncového bodu instance.
   *
   * @return x-ová souřadnice koncového bodu.
   */
  public int getKX() {
    return kx;
  }

  /***************************************************************************
   * Vrátí y-ovou souřadnici koncového bodu instance.
   *
   * @return y-ová souřadnice koncového bodu.
   */
  public int getKY() {
    return ky;
  }

  /***************************************************************************
   * Vrátí pozici koncového bodu instance.
   *
   * @return Pozice koncového bodu.
   */
  public Position getKPosition() {
    return new Position(getKX(), getKY());
  }

  /***************************************************************************
   * Nastaví novou pozici koncového bodu instance.
   *
   * @param kx
   *          Nová x-ová souřadnice koncového bodu
   * @param ky
   *          Nová y-ová souřadnice koncového bodu
   */
  public void setKPosition(int kx, int ky) {
    this.kx = kx;
    this.ky = ky;
    CM.repaint();
  }

  /***************************************************************************
   * Nastaví pozici koncového bodu instance.
   *
   * @param kPosition
   *          Nová pozice koncového bodu.
   */
  public void setKPosition(Position kPosition) {
    setPosition(kPosition.x, kPosition.y);
  }

  /***************************************************************************
   * Vrátí barvu instance.
   *
   * @return Instance třídy Barva definující nastavenou barvu.
   */
  public MyColor getColor() {
    return color;
  }

  /***************************************************************************
   * Nastaví novou barvu instance.
   *
   * @param newColor
   *          Požadovaná nová barva.
   */
  public void setColor(MyColor newColor) {
    color = newColor;
    CM.repaint();
  }

  /***************************************************************************
   * Vrátí název instance, tj. název její třídy následovaný pořadím.
   *
   * @return Řetězec s názvem instance.
   */
  public String getName() {
    return name;
  }

//== PŘEKRYTÉ METODY IMPLEMENTOVANÝCH ROZHRANÍ =================================

  /***************************************************************************
   * Za pomoci dodaného kreslítka vykreslí obraz své instance
   * na animační plátno.
   *
   * @param graphics
   *          Kreslítko, kterým se instance nakreslí na plátno.
   */
  @Override
  public void paint(MyGraphics graphics) {
    graphics.drawLine(xPos, yPos, kx, ky, color);
  }

//== PŘEKRYTÉ ABSTRAKTNÍ METODY RODIČOVSKÉ TŘÍDY ===============================
//== PŘEKRYTÉ KONKRÉTNÍ METODY RODIČOVSKÉ TŘÍDY ================================

  /***************************************************************************
   * Vrátí textovou reprezentaci dané instanci.
   * Používá se především při ladění.
   *
   * @return Název třídy následovaný pořadím a souřadnicemi krajních bodů
   */
  @Override
  public String toString() {
    return name + ": [" + xPos + ";" + yPos + "]-[" + kx + ";" + ky + "]";
  }

//== NOVĚ ZAVEDENÉ METODY INSTANCÍ =============================================

  /***************************************************************************
   * Spojí čárou zadané body.
   *
   * @param px
   *          x-ová souřadnice počátku, x=0 má levý okraj plátna
   * @param py
   *          y-ová souřadnice počátku, y=0 má horní okraj plátna
   * @param kx
   *          x-ová souřadnice koncového bodu
   * @param ky
   *          y-ová souřadnice koncového bodu
   */
  public void connect(int px, int py, int kx, int ky) {
    setPosition(px, py);
    this.kx = kx;
    this.ky = ky;
    CM.repaint();
  }

  /***************************************************************************
   * Přesune instanci o zadaný počet bodů vpravo,
   * při záporné hodnotě parametru vlevo.
   *
   * @param distance
   *          Vzdálenost, o kterou se instance přesune.
   */
  public void moveRight(int distance) {
    setPosition(xPos + distance, yPos);
  }

  /***************************************************************************
   * Přesune instanci o zadaný počet bodů dolů,
   * při záporné hodnotě parametru nahoru.
   *
   * @param distance
   *          Počet bodů, o které se instance přesune.
   */
  public void moveDown(int distance) {
    setPosition(xPos, yPos + distance);
  }

//== SOUKROMÉ A POMOCNÉ METODY TŘÍDY ===========================================
//== SOUKROMÉ A POMOCNÉ METODY INSTANCÍ ========================================
//== VNOŘENÉ A VNITŘNÍ TŘÍDY ===================================================
//== TESTY A METODA MAIN =======================================================
}
