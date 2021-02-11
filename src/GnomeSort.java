public class GnomeSort {

    //Codigo obtenido de GeeksforGeeks
    public Comparable[] sortear(Comparable[] list)
    {
        int i=1;
        int j=2;
        Comparable tmp;

        while(i<list.length){
            if(list[i-1].compareTo(list[i])>0){
                tmp = list[i-1];
                list[i-1] =list[i];
                list[i--] = tmp;
                i = (i==0) ? j++:i;
            }else{
                i = j; j++;
            }
        }
        return list;
    }
}
