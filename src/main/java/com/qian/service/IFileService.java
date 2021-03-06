package com.qian.service;

import java.util.List;
import java.util.Map;

public interface IFileService {
    List<Map<String, Object>> findUserFile(Integer file_upload_user,String fileType,String isShare,Integer page,Integer limit);
    int updataFileName(Map map);
    int deleteFileById(List<String> list);
    int updateFileStatus(Map map);
    int updateDownloadCount(int file_id);
}
