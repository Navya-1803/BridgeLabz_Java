public class Line{
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Double calculateLength(){
        return Math.sqrt(Math.pow(endPoint.getX()-startPoint.getX(), 2)+ Math.pow(endPoint.getY()-startPoint.getY(), 2));
    }

    public boolean equalsToLine(Line otherLine){
        Double thisLength = this.calculateLength();
        Double otherLength = otherLine.calculateLength();

        return thisLength.equals(otherLength);
    }

    public int compareToLine(Line otherLine) {
        Double thisLength = this.calculateLength();
        Double otherLength = otherLine.calculateLength();

        return thisLength.compareTo(otherLength);
    }

    public int compareTo(Line otherLine) {
        Double thisLength = this.calculateLength();
        Double otherLength = otherLine.calculateLength();
        return thisLength.compareTo(otherLength);
    }
}