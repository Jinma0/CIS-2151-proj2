package proj2;

abstract class Enemy {
    int weight;
    int height;

    public int getWeight(){
        return weight;
    }

    public int getHeight(){
        return height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setHeight(int height){
        this.height = height;
    }
}
