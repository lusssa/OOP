public class Enemy {
    private String type;
    private int damage;
    private int x;
    private int y;
    private int height;
    private int width;

    public Enemy(String type, int damage, int x, int y, int width, int height) {
        setType(type);
        setDamage(damage);
        this.x = x;
        this.y = y;
        setWidth(width);
        setHeight(height);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Tip ne smije biti prazan");
        }
        this.type = type.trim();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        if(damage >= 0 && damage <= 200) {
            this.damage = damage;
        }
    }

    public String toString() {
        return "Enemy[" + "tip: " + type + ", damage: " + damage + ", x: " + x + ", y: " + y + ", width: " + width + ", height: " + height + "]";
    }

}
