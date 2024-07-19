import javax.swing.*;
import javax.swing.JOptionPane;
public class Seguimiento1 {

        public static void main(String[] args) {
            int codMenuPpal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInternacional = 0;
            int totalDishesProcessed = 0, typicalDishes = 0, cartaDishes = 0, internationalDishes = 0;
            double totalAmount = 0;
            String userName;

            userName = JOptionPane.showInputDialog("Por favor, ingrese su nombre:");

            do {
                String menu = "MENU RESTAURANTE\n\n";
                menu += "1. Plato Típico\n";
                menu += "2. Plato a la Carta\n";
                menu += "3. Plato Internacional\n";
                menu += "4. Salir\n\n";
                menu += "Por favor seleccione una opción \n";
                codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (codMenuPpal) {
                    case 1:
                        do {
                            String menuTipico = "MENU TÍPICO\n\n";
                            menuTipico += "1. Frijoles - $12000\n";
                            menuTipico += "2. Sopa de Verduras - $8000\n";
                            menuTipico += "3. Sancocho - $9000\n";
                            menuTipico += "4. Chuleta con papas - $12000\n";
                            menuTipico += "5. Tamal - $10000\n";
                            menuTipico += "6. Crema de Ajiaco - $15000\n";
                            menuTipico += "7. Regresar\n";
                            menuTipico += "Por favor seleccione una opción \n";
                            codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                            switch (codMenuTipico) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $12000");
                                    totalDishesProcessed++;
                                    typicalDishes++;
                                    totalAmount += 12000;
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Sopa de Verduras, el costo es de $8000");
                                    totalDishesProcessed++;
                                    typicalDishes++;
                                    totalAmount += 8000;
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sancocho, el costo es de $9000");
                                    totalDishesProcessed++;
                                    typicalDishes++;
                                    totalAmount += 9000;
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Chuleta con papas, el costo es de $12000");
                                    totalDishesProcessed++;
                                    typicalDishes++;
                                    totalAmount += 12000;
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Tamal, el costo es de $10000");
                                    totalDishesProcessed++;
                                    typicalDishes++;
                                    totalAmount += 10000;
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Crema de Ajiaco, el costo es de $15000");
                                    totalDishesProcessed++;
                                    typicalDishes++;
                                    totalAmount += 15000;
                                    break;
                                case 7:
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                    break;
                            }
                        } while (codMenuTipico != 3);
                        break;
                    case 2:
                        do {
                            String menuCarta = "MENU A LA CARTA\n\n";
                            menuCarta += "1. Filete de Res - $15000\n";
                            menuCarta += "2. Pollo Asado - $13000\n";
                            menuCarta += "3. Trucha al Ajillo - $23000\n";
                            menuCarta += "4. Lomo de Cerdo - $13000\n";
                            menuCarta += "5. Lasagna - $20000\n";
                            menuCarta += "6. Ensalada Cesar - $25000\n";
                            menuCarta += "7. Sobrebarriga en salsa Criolla - $38000\n";
                            menuCarta += "8. Regresar\n";
                            menuCarta += "Por favor seleccione una opción \n";
                            codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                            switch (codMenuCarta) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Filete de Res, el costo es de $15000");
                                    totalDishesProcessed++;
                                    cartaDishes++;
                                    totalAmount += 15000;
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Pollo Asado, el costo es de $13000");
                                    totalDishesProcessed++;
                                    cartaDishes++;
                                    totalAmount += 13000;
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Trucha al Ajillo, el costo es de $23000");
                                    totalDishesProcessed++;
                                    cartaDishes++;
                                    totalAmount += 23000;
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Lomo de Cerdo, el costo es de $13000");
                                    totalDishesProcessed++;
                                    cartaDishes++;
                                    totalAmount += 13000;
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Lasagna, el costo es de $20000");
                                    totalDishesProcessed++;
                                    cartaDishes++;
                                    totalAmount += 20000;
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Ensalada Cesar, el costo es de $25000");
                                    totalDishesProcessed++;
                                    cartaDishes++;
                                    totalAmount += 25000;
                                    break;
                                case 7:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Sobrebarriga en salsa Criolla, el costo es de $38000");
                                    totalDishesProcessed++;
                                    cartaDishes++;
                                    totalAmount += 38000;
                                    break;
                                case 8:
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                    break;
                            }
                        } while (codMenuCarta != 3);
                        break;
                    case 3:
                        do {
                            String menuInternacional = "MENU INTERNACIONAL\n\n";
                            menuInternacional += "1. Pasta Italiana - $20000\n";
                            menuInternacional += "2. Sushi - $25000\n";
                            menuInternacional += "3. Tacos - $25000\n";
                            menuInternacional += "4. Ceviche Peruano - $35000\n";
                            menuInternacional += "5. Paella - $45000\n";
                            menuInternacional += "6. Panne Cook - $25000\n";
                            menuInternacional += "7. Tortilla Española - $30000\n";
                            menuInternacional += "8. Regresar\n";
                            menuInternacional += "Por favor seleccione una opción \n";
                            codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

                            switch (codMenuInternacional) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Pasta Italiana, el costo es de $20000");
                                    totalDishesProcessed++;
                                    internationalDishes++;
                                    totalAmount += 20000;
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Sushi, el costo es de $25000");
                                    totalDishesProcessed++;
                                    internationalDishes++;
                                    totalAmount += 25000;
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado unos Tacos, el costo es de $25000");
                                    totalDishesProcessed++;
                                    internationalDishes++;
                                    totalAmount += 25000;
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Ceviche Peruano, el costo es de $35000");
                                    totalDishesProcessed++;
                                    internationalDishes++;
                                    totalAmount += 35000;
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Paella, el costo es de $45000");
                                    totalDishesProcessed++;
                                    internationalDishes++;
                                    totalAmount += 45000;
                                    break;
                                case 6:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado un Panne Cook, el costo es de $25000");
                                    totalDishesProcessed++;
                                    internationalDishes++;
                                    totalAmount += 25000;
                                    break;
                                case 7:
                                    JOptionPane.showMessageDialog(null, "Se ha solicitado una Tortilla Española, el costo es de $30000");
                                    totalDishesProcessed++;
                                    internationalDishes++;
                                    totalAmount += 25000;
                                    break;
                                case 8:
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                    break;
                            }
                        } while (codMenuInternacional != 3);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Gracias por visitar nuestro restaurante. ¡Hasta la próxima!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                        break;
                }
            } while (codMenuPpal != 4);

            String factura = "Factura\n";
            factura += "Nombre del usuario: " + userName + "\n";
            factura += "Total de platos procesados: " + totalDishesProcessed + "\n";
            factura += "Total de platos típicos: " + typicalDishes + "\n";
            factura += "Total de platos a la carta: " + cartaDishes + "\n";
            factura += "Total de platos internacionales: " + internationalDishes + "\n";
            factura += "Total a pagar: $" + totalAmount + "\n";

            JOptionPane.showMessageDialog(null, factura);
        }
    }

