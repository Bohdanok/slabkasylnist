package bohdan.task3;


import lombok.Builder;

@Builder
public class CompanySomething {
    public CompanyData enrich(String domain){
        return CompanyData.builder().build();
    }   
}