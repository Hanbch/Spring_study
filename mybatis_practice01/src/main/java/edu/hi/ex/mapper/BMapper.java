package edu.hi.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hi.ex.vo.BoardVO;

@Mapper
public interface BMapper {
	public List<BoardVO> getList();
	
}
