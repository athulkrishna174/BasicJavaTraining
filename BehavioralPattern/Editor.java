public class Editor {
    private String content;
    private History history;

    public Editor() {
        history = new History();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        history.push(createState());
    }

    private EditorState createState(){
        return new EditorState(content);
    }

    public void undo(){
        restore(history.pop());
    }

    private void restore(EditorState state){
        if(state != null)
            content = state.getContent();
    }
}
