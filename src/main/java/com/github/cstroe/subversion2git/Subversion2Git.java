package com.github.cstroe.subversion2git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.RefUpdate;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

public class Subversion2Git {
    public static void main(String[] argv) throws IOException, GitAPIException {
        File localPath = new File("/tmp/test_repo/.git");
        localPath.delete();

        Git git = Git.init().setDirectory(localPath).call();
        git.branchCreate().setName("master").call();
        git.checkout().setName("master").call();
        git.add().addFilepattern("test.txt").
    }
}
