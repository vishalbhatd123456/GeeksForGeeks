class CheckBit{
    static boolean checkKthBit(int n, int k){
        if (((n>>k)&1)==1) 
        return true; 
        else
        return false;
    }
}
