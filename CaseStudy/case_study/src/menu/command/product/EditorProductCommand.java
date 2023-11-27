package menu.command.product;

import ProductsFunction.CurrentUserProductsList;
import menu.command.Command;
import menu.itemList.EditorProductMenu;

public class EditorProductCommand implements Command {
    @Override
    public void execute() {
        for(int i = 0; i < CurrentUserProductsList.getInstance().getProductsList().size(); i++){
            System.out.println(i + ". " + CurrentUserProductsList.getInstance().getProductsList().get(i));
        }
        EditorProductMenu editorProductMenu = new EditorProductMenu();
        editorProductMenu.navigate();
    }
}
