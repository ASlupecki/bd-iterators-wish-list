import java.util.List;
import java.util.ListIterator;

public class WishList {



    /**
     * Add a given item to the end of the list.
     * @param wishList the given list the item is to be added to
     * @param item the given item to be added to the list
     * @return the wishList with the newly added item
     */
    public List<WishListItem> addLast(List<WishListItem> wishList, WishListItem item) {
        ListIterator<WishListItem> iterator = wishList.listIterator();

        while(iterator.hasNext()) {
            iterator.next();
        }

        iterator.add(item);

        return wishList;
    }

    /**
     * Add an item at a specific index of the list. If the index is out of bounds, add the item to the end of the list.
     * @param wishList the given list the item is to be added to
     * @param item the given item to be added to the list
     * @param index the given index to add the item at
     * @return the wishList with the newly added item
     */
    public List<WishListItem> addAtIndex(List<WishListItem> wishList, WishListItem item, int index) {
        ListIterator<WishListItem> iterator = wishList.listIterator();

        if(index > wishList.size() - 1) {
            addLast(wishList, item);
        }

        if(index <= wishList.size() - 1) {
            for(int i = 0; i < wishList.size(); i++) {
                if(index == i) {
                    iterator.add(item);
                } else {
                    iterator.next();
                }

            }

        }
        return wishList;
    }

    /**
     * Safely remove all items from the list.
     * @param wishList the given list that is to have all items removed from
     * @return the empty wishList
     */
    public List<WishListItem> removeAll(List<WishListItem> wishList) {

        ListIterator<WishListItem> iterator = wishList.listIterator();

        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        return wishList;
    }

    /**
     * Remove a given item from the list.
     * @param wishList the given list that is to have the item removed from
     * @param item the given item that is to be removed from the list
     * @return the wishList with the removed item
     */
    public List<WishListItem> removeItem(List<WishListItem> wishList, WishListItem item) {
        ListIterator<WishListItem> iterator = wishList.listIterator();

        for (WishListItem wishListItem : wishList) {
            iterator.next();
            if (wishListItem == item) {
                iterator.remove();
            }
        }


        return wishList;
    }
}
