package cz.kozusznik.pl1.shapes.manager;

import cz.kozusznik.pl1.shapes.MyColor;
import cz.kozusznik.pl1.shapes.Position;
import javafx.scene.text.Font;

/*******************************************************************************
 * Třída pro Zobrazení textu na aktivním plátně.
 * Jedná se o výchozí podobu třídy v souboru projektů.
 *
 * @author Rudolf Pecinovský
 * @version 2.01, duben 2004
 */
public class Text implements IPaintable {
//== KONSTANTNÍ ATRIBUTY TŘÍDY =================================================

  /** Konstanta označující text vysazený netučným, nekurzivním písmem. */
  public static final int PLAIN = 0;

  /** Konstanta označující text vysazený tučným, nekurzivním písmem. */
  public static final int BOLD = 1;

  /** Konstanta označující text vysazený netučným, kurzivním písmem. */
  public static final int ITALIC = 2;

  /**
   * Počáteční barva nakreslené instance v případě,
   * kdy uživatel žádnou požadovanou barvu nezadá -
   * pro text Barva.ČERNÁ.
   */
  public static final MyColor DEFAULT_COLOR = MyColor.BLACK;

  /** Aktivní plátno, které dohlíží na správné vykreslení instance. */
  private static final CanvasManager SP = CanvasManager.getInstance();

//== PROMĚNNÉ ATRIBUTY TŘÍDY ===================================================

//== KONSTANTNÍ ATRIBUTY INSTANCÍ ==============================================

  /** Text uchovávaný a zobrazovaný instancí. */
  private final String name;

//== PROMĚNNÉ ATRIBUTY INSTANCÍ ================================================

  private int xPos; //Bodová x-ová souřadnice instance
  private int yPos; //Bodová y-ová souřadnice instance
  private MyColor barva; //Barva instance
  private Font font; //Písmo, kterým se text sází
  private Font kfont; //Písmo nastavené pro kreslítko

//== PŘÍSTUPOVÉ METODY VLASTNOSTÍ TŘÍDY ========================================
//== OSTATNÍ METODY TŘÍDY ======================================================

//##############################################################################
//== KONSTRUKTORY A TOVÁRNÍ METODY =============================================

  /***************************************************************************
   * Vytvoří novou instanci s implicitními rozměry, umístěním a barvou.
   * Instance bude umístěna v levém horním rohu plátna
   * a bude mít implicitní barvu,
   * a vysazena implicitním písmem (tučným 12bodovým písmem Dialog).
   *
   * @param text
   *          Vypisovaný text
   */
  public Text(String text) {
    this(text, 0, 0);
  }

  /***************************************************************************
   * Vytvoří novou instanci se zadanou polohou a rozměry
   * a implicitní barvou
   * a vysazena implicitním písmem (tučným 12bodovým písmem Dialog).
   *
   * @param text
   *          Vypisovaný text
   * @param x
   *          x-ová souřadnice instance, x>=0, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y>=0, y=0 má horní okraj plátna
   */
  public Text(String text, int x, int y) {
    this(text, x, y, DEFAULT_COLOR);
  }

  /***************************************************************************
   * Vytvoří novou instanci se zadanou polohou a rozměry
   * a implicitní barvou
   * a implicitním písmem (bude vysazen tučným 12bodovým písmem Dialog).
   *
   * @param text
   *          Vypisovaný text
   * @param počátek
   *          Pozice počátku instance
   */
  public Text(String text, Position počátek) {
    this(text, počátek.x, počátek.y);
  }

  /***************************************************************************
   * Vytvoří novou instanci se zadanou polohou, rozměry a barvou.
   *
   * @param text
   *          Vypisovaný text
   * @param počátek
   *          Pozice počátku instance
   * @param color
   *          Barva vytvářené instance
   */
  public Text(String text, Position počátek, MyColor color) {
    this(text, počátek.x, počátek.y, color);
  }

  /***************************************************************************
   * Vytvoří novou instanci se zadanou polohou, rozměry a barvou.
   *
   * @param text
   *          Vypisovaný text
   * @param x
   *          x-ová souřadnice instance, x>=0, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y>=0, y=0 má horní okraj plátna
   * @param color
   *          Barva vytvářené instance
   */
  public Text(String text, int x, int y, MyColor color) {
    name = text;
    xPos = x;
    yPos = y;
    barva = color;
    font = new Font("Dialog", 12);
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
    SP.repaint();
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
   * Vrátí barvu instance.
   *
   * @return Instance třídy Barva definující nastavenou barvu.
   */
  public MyColor getBarva() {
    return barva;
  }

  /***************************************************************************
   * Nastaví novou barvu instance.
   *
   * @param nová
   *          Požadovaná nová barva.
   */
  public void setBarva(MyColor nová) {
    barva = nová;
    SP.repaint();
  }

  /***************************************************************************
   * Tato metoda je tu jenom proto, aby se text sjednotil s ostatními
   * třídami - jinak text ji samozřejmě nepotřebuje, protože tištěný text
   * je sám názvem instance.
   *
   * @return Uložený text.
   */
  public String getNázev() {
    return name;
  }

  /***************************************************************************
   * Nastaví font, kterým se bude daný text sázet.
   *
   * @param název
   *          Název fontu - je možno zadat jeden z názvů:
   *          "Dialog", "DialogInput", "Monospaced",
   *          "Serif", "SansSerif".
   * @param řez
   *          Je možno zadat některý z řezů:
   *          Text.OBYČEJNÝ, Text.TUČNÝ, Text.KURZIVA,
   *          případně Text.TUČNÝ|Text.KURZIVA
   * @param velikost
   *          Velikost písma v bodech.
   */
  public void setFont(String nazev, int style, int velikost) {
    font = new Font(nazev, velikost);
  }

//== PŘEKRYTÉ METODY IMPLEMENTOVANÝCH ROZHRANÍ =================================

  /***************************************************************************
   * Za pomoci dodaného kreslítka vykreslí obraz své instance
   * na animační plátno.
   *
   * @param kreslítko
   *          Kreslítko, kterým se instance nakreslí na plátno.
   */
  @Override
  public void paint(MyGraphics graphics) {
    if (font != kfont) {
      graphics.setFont(font);
      kfont = font;
    }
    graphics.drawText(name, xPos, yPos + font.getSize(), barva);
  }

//== PŘEKRYTÉ ABSTRAKTNÍ METODY RODIČOVSKÉ TŘÍDY ===============================
//== PŘEKRYTÉ KONKRÉTNÍ METODY RODIČOVSKÉ TŘÍDY ================================

  /***************************************************************************
   * Převede instanci na řetězec. Používá se především při ladění.
   *
   * @return Řetězcová reprezentace dané instance.
   */
  @Override
  public String toString() {
    return name;
  }

//== NOVĚ ZAVEDENÉ METODY INSTANCÍ =============================================

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
