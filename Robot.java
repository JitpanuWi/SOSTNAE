class Robot {
    private String name;
    private int x;
    private int y;
    private int orientation;

    public Robot(String name){
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.orientation = 0;
    }

    void moveForward(int units){
        switch (orientation){
            case 0:
                y+=units;
                break;
            case 90:
                x+=units;
                break;
            case 180:
                y-=units;
                break;
            case 270:
                x-=units;
        }
    }

    void rotate(int degrees){
        orientation += degrees;
        if (orientation == 360){
            orientation = 0;
        }
    }

    String getLocation(){
        String direction = "";
        switch (orientation){
            case 0:
                direction = "North";
                break;
            case 90:
                direction = "East";
                break;
            case 180:
                direction = "South";
                break;
            case 270:
                direction = "West";
        }

        String message = "Robot "+name+" at ("+x+", "+y+"), facing "+direction;

        return message;
    }

}
