package hasRealtionship4;

public class Book {
	
    private Page[] page = {
    		new Page("Yellow" ),
    		new Page("Green"), 
    		new Page("Pink" ),
    		new Page("Red"), 
    };

	public Page[] getPage() {
		return page;
	}

	public void setPage(Page[] page) {
		this.page = page;
	}
    
	

}
