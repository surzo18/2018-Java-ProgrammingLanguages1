package pl1.shapes.manager;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import pl1.shapes.MyColor;

/*******************************************************************************
 * Třída Kreslítko slouží k zprostředkování kreslících schopností objektům
 * přihlášeným u {@code SprávcePlátna}.
 * Je konstruován jako adaptér objektu {@code java.awt.Graphics2D}.
 *
 * @author Rudolf Pecinovský
 * @version 0.00.000, 0.0.2003
 */
public class MyGraphics {
//== KONSTANTNÍ ATRIBUTY TŘÍDY =================================================
//== PROMĚNNÉ ATRIBUTY TŘÍDY ===================================================
//== KONSTANTNÍ ATRIBUTY INSTANCÍ ==============================================

  private GraphicsContext g;

//== PROMĚNNÉ ATRIBUTY INSTANCÍ ================================================

  //private MyColor backgroundColor = null;

//== PŘÍSTUPOVÉ METODY VLASTNOSTÍ TŘÍDY ========================================
//== OSTATNÍ METODY TŘÍDY ======================================================

//##############################################################################
//== KONSTRUKTORY A TOVÁRNÍ METODY =============================================

  /***************************************************************************
   * Inicializuje atribut adaptovaným objkektem.
   * Předpokládá pouze spolupráci se psrávcem plátna,
   * který bude ve stejném balíčku - proto je package private.
   *
   * @param g
   */
  MyGraphics(GraphicsContext g) {
    this.g = g;
  }

//== PŘÍSTUPOVÉ METODY VLASTNOSTÍ INSTANCÍ =====================================

  /***************************************************************************
   * Nastaví font, kterým se budou sázet vypisované texty.
   *
   * @param font
   *          Nastavovaný font
   */
  public void setFont(Font font) {
    g.setFont(font);
  }

//== PŘEKRYTÉ METODY IMPLEMENTOVANÝCH ROZHRANÍ =================================
//== PŘEKRYTÉ ABSTRAKTNÍ METODY RODIČOVSKÉ TŘÍDY ===============================
//== PŘEKRYTÉ KONKRÉTNÍ METODY RODIČOVSKÉ TŘÍDY ================================
//== NOVĚ ZAVEDENÉ METODY INSTANCÍ =============================================

  /***************************************************************************
   * Vykreslí zadanou barvou na zadaných souřadnicích nevyplněný ovál
   * zadaného rozměru.
   *
   * @param x
   *          x-ová souřadnice instance, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y=0 má horní okraj plátna
   * @param width
   *          Šířka kresleného oválu
   * @param height
   *          Výška kresleného oválu
   * @param color
   *          Barva kresleného oválu
   */
  public void drawEllipse(double x, double y, double width, double height,
      MyColor color) {
    g.setStroke(color.getColor());
    g.strokeOval(x, y, width, height);
  }

  /***************************************************************************
   * Vykreslí zadanou barvou na zadaných souřadnicích vyplněný ovál
   * zadaného rozměru.
   *
   * @param x
   *          x-ová souřadnice instance, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y=0 má horní okraj plátna
   * @param width
   *          Šířka kresleného oválu
   * @param height
   *          Výška kresleného oválu
   * @param color
   *          Barva kresleného oválu
   */
  public void fillEllipse(double x, double y, double width, double height,
      MyColor color) {
    g.setFill(color.getColor());
    g.fillOval(x, y, width, height);
  }

  /***************************************************************************
   * Vykreslí zadanou barvou na zadaných souřadnicích nevyplněný obdélník
   * zadaného rozměru.
   *
   * @param x
   *          x-ová souřadnice instance, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y=0 má horní okraj plátna
   * @param width
   *          Šířka kresleného obdélníku
   * @param height
   *          Výška kresleného obdélníku
   * @param color
   *          Barva kresleného obdélníku
   */
  public void drawRectangle(double x, double y, double width, double height,
      MyColor color) {
    g.setStroke(color.getColor());
    g.strokeRect(x, y, width, height);
  }

  /***************************************************************************
   * Vykreslí zadanou barvou na zadaných souřadnicích vyplněný obdélník
   * zadaného rozměru.
   *
   * @param x
   *          x-ová souřadnice instance, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y=0 má horní okraj plátna
   * @param width
   *          Šířka kresleného obdélníku
   * @param height
   *          Výška kresleného obdélníku
   * @param color
   *          Barva kresleného obdélníku
   */
  public void fillRectangle(double x, double y, double width, double height,
      MyColor color) {
    g.setFill(color.getColor());
    g.fillRect(x, y, width, height);
  }

  /***************************************************************************
   * Vykreslí zadanou barvou nevyplněný mnohoúhelník se zadnými vrcholy.
   *
   * @param x
   *          Pole x-ových souřadnic vrcholů
   * @param y
   *          Pole y-ových souřadnic vrcholů
   * @param color
   *          Barva kresleného obdélníku
   */
  public void drawPolygon(double[] x, double[] y, MyColor color) {
    g.setStroke(color.getColor());
    g.strokePolygon(x, y, Math.min(x.length, y.length));
  }

  /***************************************************************************
   * Vykreslí zadanou barvou vyplněný mnohoúhelník se zadnými vrcholy.
   *
   * @param x
   *          Pole x-ových souřadnic vrcholů
   * @param y
   *          Pole y-ových souřadnic vrcholů
   * @param color
   *          Barva kresleného obdélníku
   */
  public void fillPolygon(double[] x, double[] y, MyColor color) {
    g.setFill(color.getColor());
    g.fillPolygon(x, y, Math.min(x.length, y.length));
  }

  /***************************************************************************
   * Vykreslí zadanou barvou čáru se zadanými vrcholy.
   *
   * @param x1
   *          x-ová souřadnice počátku, x=0 má levý okraj plátna
   * @param y1
   *          y-ová souřadnice počátku, y=0 má horní okraj plátna
   * @param x2
   *          x-ová souřadnice konce
   * @param y2
   *          y-ová souřadnice konce
   * @param color
   *          Barva kresleného obdélníku
   */
  public void drawLine(double x1, double y1, double x2, double y2,
      MyColor color) {
    g.setStroke(color.getColor());
    g.strokeLine(x1, y1, x2, y2);
  }

  /***************************************************************************
   * Vypíše zadanou barvou zadaný text na zadaných souřadnicích.
   *
   * @param text
   *          Vypisovaný text
   * @param x
   *          x-ová souřadnice instance, x=0 má levý okraj plátna
   * @param y
   *          y-ová souřadnice instance, y=0 má horní okraj plátna
   * @param color
   *          Barva kresleného obdélníku
   */
  public void drawText(String text, double x, double y, MyColor color) {
    g.setStroke(color.getColor());
    g.strokeText(text, x, y);
  }

//== SOUKROMÉ A POMOCNÉ METODY TŘÍDY ===========================================
//== SOUKROMÉ A POMOCNÉ METODY INSTANCÍ ========================================
//== VNOŘENÉ A VNITŘNÍ TŘÍDY ===================================================
//== TESTY A METODA MAIN =======================================================
}
