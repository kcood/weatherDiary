package zerobase.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Memo {
    /*project DB, memo 테이블 칼럼들이랑 맞춘것들*/
    private int id;
    private String text;
}
