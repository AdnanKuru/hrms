package project.hrms.core.utulities;

public class SuccessResult extends  Result{

    public SuccessResult(){
        super(true);
    }

    public SuccessResult(String message) {
        super(true,message);
    }
}
