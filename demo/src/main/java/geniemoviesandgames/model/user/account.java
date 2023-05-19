package geniemoviesandgames.model.user;

import java.util.ArrayList;

import geniemoviesandgames.model.product.item;

abstract public class account {

    public enum LevelOfServices {
        Guest, Regular, VIP
    }

    protected String accountID;
    protected String accountFullname;
    protected String accountUsername;
    protected String accountPassword;
    protected String accountPhone;
    protected String accountAddress;
    protected LevelOfServices accountLevelOfServices;

    protected ArrayList<item> accountListOfRentals = new ArrayList<>();

    /**
     * @return String return the accountID
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * @param accountID the accountID to set
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * @return String return the accountFullname
     */
    public String getAccountFullname() {
        return accountFullname;
    }

    /**
     * @param accountFullname the accountFullname to set
     */
    public void setAccountFullname(String accountFullname) {
        this.accountFullname = accountFullname;
    }

    /**
     * @return String return the accountUsername
     */
    public String getAccountUsername() {
        return accountUsername;
    }

    /**
     * @param accountUsername the accountUsername to set
     */
    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    /**
     * @return String return the accountPassword
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * @param accountPassword the accountPassword to set
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * @return int return the accountPhone
     */
    public String getAccountPhone() {
        return accountPhone;
    }

    /**
     * @param accountPhone the accountPhone to set
     */
    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }

    /**
     * @return String return the accountAddress
     */
    public String getAccountAddress() {
        return accountAddress;
    }

    /**
     * @param accountAddress the accountAddress to set
     */
    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    /**
     * @return item[] return the accountListOfRentals
     */
    public ArrayList<item> getAccountListOfRentals() {
        return accountListOfRentals;
    }

    /**
     * @param accountListOfRentals the accountListOfRentals to set
     */
    public void setAccountListOfRentals(ArrayList<item> rentList) {
        if (rentList != null) {
            accountListOfRentals.addAll(rentList);
        }
    }

    public LevelOfServices getAccountLevelOfServices() {
        return this.accountLevelOfServices;
    }

    public void setAccountLevelOfServices(LevelOfServices services) {
        this.accountLevelOfServices = services;
    }

    public account() {
    }

    public account(String ID, String name, String address, String phone, ArrayList<item> rentals, LevelOfServices services,
            String username, String password) {
        setAccountAddress(address);
        setAccountFullname(name);
        setAccountID(ID);
        setAccountPassword(password);
        setAccountPhone(phone);
        setAccountUsername(username);
        setAccountLevelOfServices(services);
        if (rentals != null) {
            setAccountListOfRentals(rentals);
        }
    }

    /* service Setup */
    protected int itemBorrow = 0;
    protected int itemReturned = 0;

    protected int itemBorrowAllow =2;
    protected int itemReturnedToPromote =3;

    /**
     * @return int itemBorrow return the
     */
    public int getitemBorrow() {
        return this.itemBorrow;
    }

    /**
     * @param the to set
     */
    public void setitemBorrow(int itemBorrow) {
        this.itemBorrow = itemBorrow;
    }

    /**
     * @return int return the itemReturned
     */
    public int getItemReturned() {
        return itemReturned;
    }

    /**
     * @param itemReturned the itemReturned to set
     */
    public void setItemReturned(int itemReturned) {
        this.itemReturned = itemReturned;
    }


}