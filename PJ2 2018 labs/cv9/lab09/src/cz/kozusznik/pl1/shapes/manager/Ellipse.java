package cz.kozusznik.pl1.shapes.manager;

import cz.kozusznik.pl1.shapes.Dimension;
import cz.kozusznik.pl1.shapes.MyColor;
import cz.kozusznik.pl1.shapes.Position;

/*******************************************************************************
 * Instance třídy {@code Elipsa} představují elipsy určené
 * pro práci na virtuálním plátně při prvním seznámení s třídami a objekty.
 * Výchozí podoba třídy určená pro první seznámení s třídami a objekty.
 *
 * @author Rudolf PECINOVSKÝ
 * @version 3.00.002
 */
public class Ellipse implements IPaintable {
//== KONSTANTNÍ ATRIBUTY TŘÍDY =================================================

  /**
   * Počáteční barva nakreslené instance v případě,
   * kdy uživatel žádnou požadovanou barvu nezadá -
   * pro elipsu Barva.MODRÁ.
   */
  public static final MyColor DEFAULT_COLOR = MyColor.BLUE;

  /** Maximální povolená velikost kroku. */
  public static final int MAX_STEP = 100;

  /** Plátno, na které se bude instance kreslit. */
  private static final CanvasManager CM = CanvasManager.getInstance();

//== PROMĚNNÉ ATRIBUTY TŘÍDY ===================================================

  /**
   * Počet pixelů, o něž se instance posune
   * po bezparametrickém posunovém povelu
   */
  private static int step = 50;

  /** Počet vytvořených instancí */
  private static int count = 0;

//== KONSTANTNÍ ATRIBUTY INSTANCÍ ==============================================

  /** Pořadí vytvoření dané instance v rámci třídy. */
  private final int order = ++count;

  /** Název sestávající z názvu třídy a pořadí instance */
  private String name = "Elipsa_" + order;

//== PROMĚNNÉ ATRIBUTY INSTANCÍ ================================================

  private int xPos; //Bodová x-ová souřadnice instance
  private int yPos; //Bodová y-ová souřadnice instance
  private int width; //šířka v bodech
  private int height; //Výška v bodech
  private MyColor color; //Barva instance

//== PŘÍSTUPOVÉ METODY VLASTNOSTÍ TŘÍDY ========================================

  /***************************************************************************
   * Vrátí velikost implicitního kroku, o který se instance přesune
   * při volaní bezparametrickych metod přesunu.
   *
   * @return Velikost implicitního kroku v bodech
   */
  public static int getStep() {
    return step;
  }

  /***************************************************************************
   * Nastaví velikost implicitního kroku, o který se instance přesune
   * při volaní bezparametrickych metod přesunu.
   *
   * @param size
   *          Velikost implicitního kroku v bodech;<br/>
   *          musí platit: 0 &lt;= velikost &lt;= {@link #MAX_STEP}
   */
  public static void setStep(int size) {
    if ((size < 0) || (size > MAX_STEP)) {
      throw new IllegalArgumentException(
          "Krok musí byt z intervalu <0;" + MAX_STEP + ">.");
    }
    step = size;
  }

//== OSTATNÍ METODY TŘÍDY ======================================================

//##############################################################################
//== KONSTRUKTORY A TOVÁRNÍ METODY =============================================

  /***************************************************************************
   * Připraví novou instanci s implicitními rozměry, umístěním a barvou.
   * Instance bude umístěna v levém horním rohu plátna
   * a bude mít implicitní barvu,
   * výšku rovnu kroku a šířku dvojnásobku kroku (tj. implicitně 50x100 bodů).
   */
  public Ellipse() {
    this(0, 0, 2 * step, step);
  }

  /***************************************************************************
   * Připraví novou instanci se zadanou polohou a rozměry
   * a implicitní barvou.
   *
   * @param x
   *          x-ová souřadnice instance, x>=0, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y>=0, y=0 má horní okraj plátna
   * @param šířka
   *          Šířka vytvářené instance, šířka > 0
   * @param výška
   *          Výška vytvářené instance, výška > 0
   */
  public Ellipse(int x, int y, int width, int height) {
    this(x, y, width, height, DEFAULT_COLOR);
  }

  /***************************************************************************
   * Připraví novou instanci se zadanými rozměry, polohou a barvou.
   *
   * @param x
   *          x-ová souřadnice instance, x>=0, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y>=0, y=0 má horní okraj plátna
   * @param width
   *          Šířka vytvářené instance, šířka > 0
   * @param height
   *          Výška vytvářené instance, výška > 0
   * @param color
   *          Barva vytvářené instance
   */
  public Ellipse(int x, int y, int width, int height, MyColor color) {
    //Test platnosti parametru
    if ((x < 0) || (y < 0) || (width <= 0) || (height <= 0)) {
      throw new IllegalArgumentException(
          "\nParametry nemají povolené hodnoty: x=" + x + ", y=" + y
              + ", šířka=" + width + ", výška=" + height);
    }

    //Parametry akceptovány --> můžeme tvořit
    xPos = x;
    yPos = y;
    this.width = width;
    this.height = height;
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
   *
   * @param x
   *          Nová x-ová pozice instance
   * @param y
   *          Nová y-ová pozice instance
   */
  public void setPosition(int x, int y) {
    xPos = x;
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
   * Vrátí šířku instance.
   *
   * @return Šířka instance v bodech
   */
  public int getWidth() {
    return width;
  }

  /***************************************************************************
   * Vrátí výšku instance.
   *
   * @return Výška instance v bodech
   */
  public int getHeight() {
    return height;
  }

  /***************************************************************************
   * Vrátí instanci třídy Rozměr s rozměry instance.
   *
   * @return Rozměr s rozměry instance.
   */
  public Dimension getDimension() {
    return new Dimension(width, height);
  }

  /***************************************************************************
   * Nastaví nový "čtvercový" rozměr instance -
   * na zadaný rozměr se nastaví výška i šířka.
   *
   * @param size
   *          Nově nastavovaný rozměr v obou směrech; rozměr>0
   */
  public void setDimension(int size) {
    setDimension(size, size);
  }

  /***************************************************************************
   * Nastaví nové rozměry instance.
   *
   * @param width
   *          Nově nastavovaná šířka; šířka>=0
   * @param height
   *          Nově nastavovaná výška; výška>=0
   */
  public void setDimension(int width, int height) {
    if ((width < 0) || (height < 0)) {
      throw new IllegalArgumentException(
          "Rozměry musí byt nezáporné: šířka=" + width + ", výška=" + height);
    }
    this.width = width;
    this.height = height;
    CM.repaint();
  }

  /***************************************************************************
   * Nastaví nové rozměry instance.
   *
   * @param dimension
   *          Nově nastavovaný rozměr.
   */
  public void setDimension(Dimension dimension) {
    setDimension(dimension.width, dimension.height);
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
//== PŘEKRYTÉ ABSTRAKTNÍ METODY RODIČOVSKÉ TŘÍDY ===============================
//== PŘEKRYTÉ KONKRÉTNÍ METODY RODIČOVSKÉ TŘÍDY ================================

  /***************************************************************************
   * Převede instanci na řetězec. Používá se především při ladění.
   *
   * @return Řetězcová reprezentace dané instance.
   */
  @Override
  public String toString() {
    return name + "_(x=" + xPos + ",y=" + yPos + ",šířka=" + width + ",výška="
        + height + ",barva=" + color + ")";
  }

//== NOVĚ ZAVEDENÉ METODY INSTANCÍ =============================================

  /***************************************************************************
   * Vykreslí obraz své instance na plátno.
   */
  @Override
  public void paint(MyGraphics g) {

    g.fillEllipse(xPos, yPos, width, height, color);
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
   * Přesune instanci o krok bodů vpravo.
   */
  public void moveRight() {
    moveRight(step);
  }

  /***************************************************************************
   * Přesune instanci o krok bodů vlevo.
   */
  public void moveLeft() {
    moveRight(-step);
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

  /***************************************************************************
   * Přesune instanci o krok bodů dolů.
   */
  public void moveDown() {
    moveDown(step);
  }

  /***************************************************************************
   * Přesune instanci o krok bodů nahoru.
   */
  public void moveUp() {
    moveDown(-step);
  }

//== SOUKROMÉ A POMOCNÉ METODY TŘÍDY ===========================================
//== SOUKROMÉ A POMOCNÉ METODY INSTANCÍ ========================================
//== VNOŘENÉ A VNITŘNÍ TŘÍDY ===================================================
//== TESTY A METODA MAIN =======================================================
}
