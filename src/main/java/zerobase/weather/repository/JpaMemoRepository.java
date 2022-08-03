package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo/*어떤 클래스를 가지고 연결할지*/, Integer/*이 클래스의 key가 어떤 형식인지*/> {

}
